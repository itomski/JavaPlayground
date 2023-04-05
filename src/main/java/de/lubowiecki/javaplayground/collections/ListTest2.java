package de.lubowiecki.javaplayground.collections;

import java.util.*;

public class ListTest2 {

    public static void main(String[] args) {

        // Arrays.asList  und List.of erzeugen eine FixedSize Liste
        List<String> namen = List.of("Peter", "Bruce", "Carol", "Tony", "Natasha", "Steve");

        namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Tony", "bruce", "Natasha", "Steve"));
        //namen.addAll(List.of("Peter", "Bruce", "Carol", "Tony", "Natasha", "Steve"));
        System.out.println(namen); // unsortiert

        Collections.sort(namen); // Von den Collections können nur Listen sortiert werden
        // wenn sort keinen Comparator bekommt, sortiert es die Objekte nach
        // der natürlichen Reihenfolge, die durch die compareTo-Methode des Objektes beschrieben wird
        System.out.println(namen); // sortiert

        Collections.sort(namen, String.CASE_INSENSITIVE_ORDER); // Sortierung nach Comparator
        System.out.println(namen); // sortiert


        Comparator<String> nachLaenge1 = new CompNachLaenge(); // Comparator als Klasse

        // int compare(T o1, T o2);
        Comparator<String> nachLaenge2 = (a, b) -> a.length() - b.length(); // Comparator als Lambda

        //Collections.sort(namen, nachLaenge1); // Sortierung nach Comparator
        //Collections.sort(namen, nachLaenge2); // Sortierung nach Lambda-Comparator
        Collections.sort(namen, nachLaenge2.reversed()); // Umgekerte Reihenfolge
        System.out.println(namen); // sortiert

        namen.sort(nachLaenge2); // sort verlangt einen Comparator

        // Für die Sortierung wird entweder die natürliche Reihenfolge (compareTo-Methode) der Objekte verwendet
        // oder es MUSS ein Comparator vorgegeben werden

        // compareTo beschreibt, wie das aktuelle Objekt mit einem anderen vergliechen wird
        // Comparator beschreibt, wie zwei Objekte miteinander vergliechen werden

        int[] zahlen = {1,7,9,22,15,88,100};
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen));

        String[] namenArr = {"Peter", "Bruce", "Carol", "Tony", "bruce", "Natasha", "Steve"};
        Arrays.sort(namenArr); // verwendet compareTo von String
        Arrays.sort(namenArr, (a, b) -> a.length() - b.length()); // Nach Comparator
        Arrays.sort(namenArr, Comparator.comparing(String::length)); // Nach Comparator - Methoden-Referenz
        System.out.println(Arrays.toString(namenArr));

        System.out.println();

        // Binär-Suche
        namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Tony", "Natasha", "Steve"));
        List<String> namenClone = new ArrayList<>(namen);

        // Muss sortiert sein
        Collections.sort(namenClone);
        System.out.println(namenClone);
        int i = Collections.binarySearch(namenClone, "Carol");
        System.out.println(i);

        // Minus = Element nicht gefunden
        // + -1 zu der passenden Position (negiert), wo es gem. der Sortierung landen würde

        zahlen = new int[]{1,7,9,22,15,88,100};
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen));
        System.out.println(Arrays.binarySearch(zahlen, 17));
    }
}

class CompNachLaenge implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
