package de.lubowiecki.javaplayground.db;

import java.sql.*;
import java.util.List;

public class DbTest {

    // C R U D
    // Create (save: insert)
    // Read (getAll, getById)
    // Update (save: update)
    // Delete

    public static void main(String[] args) {

        /*
        // JDBC Treiber muss geladen werden, damut eine passende verbindung aufgebaut werden kann
        try(Connection connection = DBUtils.createConnection(); // Mit DB Verbinden
            Statement stmt = connection.createStatement()) { // Anfrage vorbereiten

            // Anfragen werden als SQL übermittelt
            ResultSet results = stmt.executeQuery("SELECT * FROM users"); // Anfrage absenden
            while(results.next()) { // Ergebnisse verarbeiten
                int id = results.getInt("id"); // id = Spaltenname
                String firstname = results.getString("firstname");
                String lastname = results.getString("lastname");
                String job = results.getString("job");
                System.out.printf("%d: %s %s, %s \n", id, firstname, lastname, job);
            }
        }
        catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }
        */

        try {
            /*
            // INSERT (CREATE)
            User u = new User();
            u.setFirstname("Bruce");
            u.setLastname("Banner");
            u.setJob("Wissenschaftler");
            DBUtils.save(u);
            System.out.println("User wurde gespeichert.");
            System.out.println("User wurde gespeichert.");
            */

            // DELETE
            //DBUtils.delete(3);
            //System.out.println("User wurde gelöscht.");


            // READ ONE
            User u = DBUtils.getById(1);
            System.out.println(u.getJob() + ", " + u.getId() + ", " + u.getLastname());

            // Objekt geändert
            u.setLastname("Klausen");

            // Zum Update an die DB geschickt
            DBUtils.save(u);
            System.out.println("User wurde geändert.");

        }
        catch (SQLException e) {
            //System.out.println("Problem beim Speichern. " + e.getMessage());
            //System.out.println("Problem beim Löschen. " + e.getMessage());
            //System.out.println("Problem beim Lesen. " + e.getMessage());
            System.out.println("Problem beim Ändern. " + e.getMessage());
        }

        System.out.println();

        try {
            // READ ALL
            List<User> users = DBUtils.getAll();
            for (User user: users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }
        }
        catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }


    }
}
