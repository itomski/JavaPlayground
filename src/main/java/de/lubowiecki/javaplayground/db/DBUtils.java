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

        // Besser! Keine SQL-Injection mehr möglich
        String sql = "INSERT INTO users (id, firstname, lastname, job) VALUES(null, ?, ?, ?)";
        try(Connection connection = createConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Inhalte für die Fragezeichen werden nicht mehr als Befehle interpretiert
            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setString(3, user.getJob());
            stmt.execute();
        }
    }


    public static List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();

        try(Connection connection = createConnection();
            Statement stmt = connection.createStatement()) {
            ResultSet results = stmt.executeQuery("SELECT * FROM users");
            while(results.next()) {
                users.add(create(results));
            }
        }
        return users;
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
