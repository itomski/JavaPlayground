package de.lubowiecki.javaplayground.db;

import java.sql.*;
import java.util.List;

public class DbTest {

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

        User u = new User();
        u.setFirstname("Bruce");
        u.setLastname("Banner");
        u.setJob("Wissenschaftler");

        try {
            DBUtils.save(u);
            System.out.println("User wurde gespeichert.");
        }
        catch (SQLException e) {
            System.out.println("Problem beim Speichern. " + e.getMessage());
        }


        try {
            List<User> users = DBUtils.getAllUsers();
            for (User user: users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }
        }
        catch (SQLException e) {
            System.out.println("Problem: " + e.getMessage());
        }


    }
}
