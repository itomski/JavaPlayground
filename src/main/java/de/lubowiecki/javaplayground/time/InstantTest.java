package de.lubowiecki.javaplayground.time;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class InstantTest {

    public static void main(String[] args) {

        Instant start = Instant.now();
        long startMs = System.currentTimeMillis();

        for(int i = 0; i < 10_000_000; i++) {
            i++;
        }

        Instant end = Instant.now();
        long endMs = System.currentTimeMillis();

        // in ms
        System.out.println(end.toEpochMilli() - start.toEpochMilli());
        System.out.println(endMs - startMs);

        // in ns
        Duration d = Duration.between(start, end);
        System.out.println(d);

        System.out.println();

        // Zeitabstand: Jahre, Monate, Tage
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2025, 10, 7);
        System.out.println(Period.between(ld1, ld2));

        System.out.println();

        // Zeitabstand: Stunden, Minuten, Sekunden, Nanosekunden
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(17, 25, 33);
        System.out.println(Duration.between(lt1, lt2));

        Year y = Year.now();
        YearMonth m = YearMonth.of(2023, 10);
        YearMonth ym = y.atMonth(10);

        System.out.println("--- LD: DAY_OF_WEEK---");

        ld1 = LocalDate.now();
        System.out.println(ld1.isSupported(ChronoField.DAY_OF_WEEK));
        //System.out.println(ld1.getLong(ChronoField.DAY_OF_WEEK));

        System.out.println("--- LD: MICRO_OF_DAY---");

        System.out.println(ld1.isSupported(ChronoField.MICRO_OF_DAY));
        //System.out.println(ld1.getLong(ChronoField.MICRO_OF_DAY));

        System.out.println("--- LT: DAY_OF_WEEK---");

        lt1 = LocalTime.now();
        System.out.println(lt1.isSupported(ChronoField.DAY_OF_WEEK));
        //System.out.println(lt1.getLong(ChronoField.DAY_OF_WEEK));

        System.out.println("--- LT: MICRO_OF_DAY---");

        System.out.println(lt1.isSupported(ChronoField.MICRO_OF_DAY));
        //System.out.println(lt1.getLong(ChronoField.MICRO_OF_DAY));

        System.out.println();

        // LocalDate, LocalTime und LocalDateTime sind Immutable
        // Period und Duration sind Immutable

        // Period normalisiert nicht d.h. Einheiten werden nicht zu höheren Einheiten umgerechnet
        Period p = Period.of(2,36, 200);
        System.out.println(p);
        // Tage können nicht automatisch auf Monate umgerechnet werden, da Startpunkt fehlt
        System.out.println(p.normalized());

        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());

        System.out.println(p.getUnits());
        System.out.println(p.get(ChronoUnit.YEARS));
        System.out.println(p.get(ChronoUnit.MONTHS));
        System.out.println(p.get(ChronoUnit.DAYS));

        // Duration und Period sind Implementierungen von TemporalAmount
        System.out.println(p.minus(Period.ofYears(2)));
        System.out.println(p.plus(Period.ofDays(300)));

        // Prüft, ob passende Einheit supported ist. Wenn nicht, dann gibt es eine Exception
        // System.out.println(p.plus(Duration.ofMinutes(36)));


    }

}
