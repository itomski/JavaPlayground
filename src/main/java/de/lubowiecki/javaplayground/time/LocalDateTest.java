package de.lubowiecki.javaplayground.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        ld = LocalDate.of(2000, 10, 25);
        ld = LocalDate.parse("2025-10-17"); // Standardformat = ISO

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Alternativ muss ein Formatter vorgegeben werden
        ld = LocalDate.parse("15.02.2015", fmt);
        System.out.println(ld); // toString benutzt ISO_DATE als Standard-Format
        ld = ld.plusDays(15);
        System.out.println(ld);
        System.out.println(ld.format(fmt)); // Formatierte ausgabe

        System.out.println("--- PLUS ---");
        System.out.println(ld.plus(Period.ofDays(100)));
        System.out.println(ld.plus(100, ChronoUnit.DAYS));
        System.out.println(ld.plusDays(100));

        System.out.println("--- MINUS ---");
        System.out.println(ld.minus(Period.ofYears(5)));
        System.out.println(ld.minus(5, ChronoUnit.YEARS));
        System.out.println(ld.plusYears(5));

        // ChronoField muss supported sein
        System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ld.get(ChronoField.DAY_OF_YEAR));
        //System.out.println(ld.get(ChronoField.MINUTE_OF_DAY)); // ist NICHT supported

        // atTime verbindet Datum mit Uhr-Zeit
        LocalDateTime ldt = ld.atTime(LocalTime.now());

        System.out.println();

        // überschreibt ein bestimmtes Feld
        System.out.println(ld);
        System.out.println(ld.with(ChronoField.DAY_OF_MONTH, 5));
        System.out.println(ld.with(ChronoField.DAY_OF_YEAR, 5));
        System.out.println(ld.with(ChronoField.DAY_OF_WEEK, 5));
    }
}
