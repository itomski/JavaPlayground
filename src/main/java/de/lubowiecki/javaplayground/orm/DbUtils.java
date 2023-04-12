package de.lubowiecki.javaplayground.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    private static final String DB_URL = "jdbc:sqlite:test2.db";

    private DbUtils() {
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}
