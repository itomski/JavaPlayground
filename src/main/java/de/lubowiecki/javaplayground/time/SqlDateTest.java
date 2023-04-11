package de.lubowiecki.javaplayground.time;

import java.time.LocalDate;
import java.sql.Date;

public class SqlDateTest {

    public static void main(String[] args) {

        // Datenbanken verwenden vorwiegend java.sql.Date

        LocalDate ld = LocalDate.now();
        Date date = Date.valueOf(ld); // LocalDate zu java.sql.Date
        ld = date.toLocalDate(); // java.sql.Date zu LocalDate

    }
}
