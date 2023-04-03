package de.lubowiecki.javaplayground.collections;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        // ArrayList: Wahlfreier-Zugriff über Index schneller
        // LinkedList: Einfügen an Index-Positionen mittendrin schneller

        // Arrays.asList(...)
        // seit Java 9: List.of(...)
        List<String> namen = new ArrayList<>(List.of("Carol", "Natasha", "Tony", "Bruce", "Peter", "Carol"));
        System.out.println(namen);

        System.out.println();

        namen = new LinkedList<>(namen);
        System.out.println(namen);

        System.out.println();

        Queue<String> warteschlage = (Queue<String>) namen;

        while(warteschlage.size() > 0) {
            System.out.println(warteschlage.poll()); // Entfernt ein Element am anfang der Warteschlange
        }

        System.out.println(warteschlage);
        warteschlage.offer("Bruce");
        warteschlage.offer("Peter");
        System.out.println(warteschlage);

    }
}
