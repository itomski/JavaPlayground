package de.lubowiecki.javaplayground.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<Integer> zahlen = new TreeSet<>(List.of(1,5,19,18,7,6,3,22,41,18,99));
        System.out.println(zahlen);

        // Views auf einen Ausschnitt des Original-Sets
        Set<Integer> head = zahlen.headSet(10); // exclusive Endelement
        System.out.println(head);

        Set<Integer> tail = zahlen.tailSet(10); // inkl. Startelement
        System.out.println(tail);

        Set<Integer> sub = zahlen.subSet(20, 50); // Start inkl. , End excl.
        System.out.println(sub);

        // Werte müssen innerhalb der Range sein
        sub.add(49); // Veränderung wirkt auch auf das Original-Set
        head.add(8);
        tail.add(10);

        System.out.println(sub);
        System.out.println(zahlen);

    }
}
