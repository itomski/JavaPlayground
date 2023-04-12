package de.lubowiecki.javaplayground.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

    private static final String DB_URL = "jdbc:sqlite:test.db";

    private DBUtils() {
    }

    private static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    public static void save(User user) throws SQLException {

        /*
        // OK
        try(Connection connection = createConnection();
            Statement stmt = connection.createStatement()) {

            // Anfällig gegen SQL-Injection
            // Durch das Einfügen neuer Datensätze wird die Datenbank aktualisiert
            stmt.executeUpdate("INSERT INTO users (id, firstname, lastname, job) " +
                                   "VALUES(null, '" + user.getFirstname() + "', '" + user.getLastname() + "', '" + user.getJob() + "')");

        }
        */

        if(user.getId() > 0) {
            update(user);
        }
        else {
            insert(user);
        }
    }

    private static void insert(User user) throws SQLException {

        // Besser! Keine SQL-Injection mehr möglich
        String sql = "INSERT INTO users (id, firstname, lastname, job) VALUES(null, ?, ?, ?)";
        try(Connection connection = createConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Inhalte für die Fragezeichen werden nicht mehr als Befehle interpretiert
            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setString(3, user.getJob());
            stmt.execute();

            // Wird automatisch ausgeführt:
            //stmt.close();
            //connection.close();
        }
    }

    private static void update(User user) throws SQLException {

        // Besser! Keine SQL-Injection mehr möglich
        String sql = "UPDATE users SET firstname = ?, lastname = ?, job = ? WHERE id = ?";
        try(Connection connection = createConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setString(3, user.getJob());
            stmt.setInt(4, user.getId());
            // execute kann für DML und DDL verwendet werden
            stmt.execute();
        }
    }


    public static List<User> getAll() throws SQLException {
        List<User> users = new ArrayList<>();

        try(Connection connection = createConnection();
            Statement stmt = connection.createStatement()) {
            // executeQuery kann nur für Abfragen verwendet werden. Liefert ein ResultSet zurück
            ResultSet results = stmt.executeQuery("SELECT * FROM users");

            // ResultSetMetaData liefert Informationen über die Tabelle und ihre Spalten
            //ResultSetMetaData meta = results.getMetaData();

            // Am anfang steht der Cursor des ResultSets vor dem ersten Datensatz (ersten Zeile)
            while(results.next()) { // next verschiebt den Cursor auf den nächsten Datensatz
                users.add(create(results));
            }
        }
        return users;
    }

    public static User getById(int id) throws SQLException {

        try(Connection connection = createConnection();
            Statement stmt = connection.createStatement()) {
            ResultSet results = stmt.executeQuery("SELECT * FROM users WHERE id = " + id);
            if(results.next()) {
                return create(results);
            }
        }
        return null;
    }

    public static void delete(User user) throws SQLException {
        delete(user.getId());
    }

    public static void delete(int id) throws SQLException {
        try(Connection connection = createConnection();
            Statement stmt = connection.createStatement()) {
            // executeUpdate kann für Alle Aktionen die nichts Zurückliefern genutzt werden
            stmt.executeUpdate("DELETE FROM users WHERE id = " + id);
        }
    }

    // Mapping: Wandelt eine Zeile aus der DB in ein Java-Objekt um
    private static User create(ResultSet row) throws SQLException {
        // Spalten aus der Datenbank werden in Eigenschaften eines Objektes geschrieben
        User user = new User();
        user.setId(row.getInt("id"));
        user.setFirstname(row.getString("firstname"));
        user.setLastname(row.getString("lastname"));
        user.setJob(row.getString("job"));
        return user;
    }
}
