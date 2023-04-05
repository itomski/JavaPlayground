package de.lubowiecki.javaplayground.collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MapTest1 {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("hamburg", 1_900_000);
        einwohner.put("london", 9_000_000);
        einwohner.put("tokio", 14_000_000);
        einwohner.put("delhi", 31_000_000);

        System.out.println(einwohner.get("tokio"));
        System.out.println(einwohner.get("berlin")); // null
        System.out.println(einwohner.getOrDefault("berlin", 0)); // 0

        einwohner.put("delhi", 12_000_000); // Wert hinter dem Schlüssel wird geändert
        System.out.println(einwohner);

        System.out.println();

        for(String k : einwohner.keySet()) {
            System.out.println(k);
        }

        System.out.println();

        for(String k : einwohner.keySet()) {
            System.out.println(k + ": " + einwohner.get(k));
        }

        System.out.println();

        for(int e : einwohner.values()) {
            System.out.println(e);
        }

        System.out.println();

        for(Map.Entry<String, Integer> e : einwohner.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println();

        Map<LocalDate, Set<Termin>> cal = new TreeMap<>();

        LocalDate heute = LocalDate.now();

        cal.put(heute, new TreeSet<>());
        cal.get(heute).add(new Termin(LocalTime.now(), "Essen mit Max"));
        cal.get(heute).add(new Termin(LocalTime.now().plusHours(1), "Auto waschen"));

        LocalDate morgen = heute.plusDays(1);
        cal.put(morgen, new TreeSet<>());
        cal.get(morgen).add(new Termin(LocalTime.now().plusHours(2), "Buchhaltung"));
        cal.get(morgen).add(new Termin(LocalTime.now(), "Gartenarbeit"));

        System.out.println(cal);
    }
}
