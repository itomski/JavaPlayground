package de.lubowiecki.javaplayground.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1);

        System.out.println();

        d1 = new Date(2015, 10, 22);
        System.out.println(d1);

        System.out.println();

        d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);

        System.out.println();
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        System.out.println(ld.plusDays(10));
        System.out.println(ld.minusWeeks(2));
        System.out.println(ld.plus(15, ChronoUnit.YEARS));

        Period p = Period.of(0, 20, 0); // Zeitabschnitt
        System.out.println(p);
        System.out.println(p.normalized());
        System.out.println(ld.plus(p));

        System.out.println();

        LocalDateTime ldt = LocalDateTime.now();
        ldt = LocalDateTime.of(ld, lt); // Aus Datum und Zeit
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        System.out.println();

        // Für Datum
        Period p2 = LocalDate.now().until(LocalDate.of(2026, 1, 1));
        p2 = Period.between(LocalDate.now(), LocalDate.of(2026, 1, 1));
        System.out.println(p2);

        // Für Zeit
        Duration d2 = Duration.between(LocalTime.now(), LocalTime.MIDNIGHT);
        System.out.println(d2);

        // Instant
        Instant start = Instant.now();

        int sum = 0;
        for(int i = 0; i < 10_000_000; i++) {
            sum += i;
        }

        Instant end = Instant.now();

        // Ablauzeit messen
        Duration erg = Duration.between(start, end);
        System.out.println(erg.getNano());

    }
}
