package de.lubowiecki.javaplayground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListTest {

    public static void main(String[] args) {

        // Unsicher!
        ArrayList al1 = new ArrayList(); // Nicht Generisch (RAW-Type verwendet)
        al1.add("Hi");
        al1.add(123); // Integer
        al1.add(123.0); // Double
        al1.add(new Object());

        for(Object o : al1) {
            //String s = (String) o;
            //System.out.println(s.toLowerCase());
            System.out.println(o); // Jedes Objekt hat eine toString-Methode
        }

        System.out.println();

        // Generische Typen sind IMMER Objekt-Typen (komplex)
        // Sicher
        //ArrayList<String> al2 = new ArrayList(100); // Generisch mit einem internen Array mit Größe 100
        ArrayList<String> al2 = new ArrayList(); // Generisch mit einem internen Array mit Größe 10
        System.out.println(al2.size()); // 0, ermitttelt, wieviele Elemente bereits drin sind
        al2.add("Aloah"); // Nimmt nur Strings entgegen
        al2.add("Peter");
        al2.add("Bruce");
        al2.add("Carol");

        for(String s : al2) { // Sicher, weil es nur Werte gleichen Typs enthält
            System.out.println(s.toUpperCase());
        }

        // wird clone auf einem Objekt ausgeführt, erzeut es eine Kopie des gleich Typs
        ArrayList<String> al3 = new ArrayList(al2); // Eine neue ArrayList mit dem Inhalt von al2 - wie clone

        // Es kann der Inhalte eine ArrayList in eine Collection anderen Typs übertragen werden
        LinkedList<String> ll1 = new LinkedList<>(al2);
        HashSet<String> hs1 = new HashSet<>(al2); // Duplikate würde nicht übernommen werden

        ArrayList<String> al4 = new ArrayList<>();
        al4.addAll(al3); // Alle elemte der anderen Liste auf einen Schlag einfügen


        System.out.println();

        ArrayList<Integer> al5 = new ArrayList();
        al5.add(100); // wird an die nächste freie Stelle eingefügt - Index: 0
        al5.add(200); // wird an die nächste freie Stelle eingefügt - Index: 1
        al5.add(300); // wird an die nächste freie Stelle eingefügt - Index: 2
        // [100, 200, 300]

        al5.add(1, 400); // wird auf Index 1 ablegt. Alter Wert an Index 1 rutscht weiter
        // [100, 400, 200, 300]

        al5.remove(2); // Entfernt Element an Index. Folgeelement rückt auf
        // [100, 400, 300]

        Integer i = al5.get(2); // liefert das Element an Index 2 zurück.
        al5.remove(i); // Entfernt das Element i (300)
        // [100, 400]

        al5.set(1, 500); // Ersetzt das Element an Index 1. Es findet keine Verschiebung statt
        // [100, 500]

        System.out.println(al5.contains(100)); // Prüft, ob Element bereits vorhanden

        System.out.println();

        ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Steve");

        ArrayList<String> namen2 = namen; // namen und namen2 sind Referenzen auf 1 Objekt auf dem Heap
        Collections.sort(namen);
        System.out.println(namen);
        System.out.println(namen2);

        System.out.println();


        // zwei getrennte Objekte auf dem Heap
        ArrayList<String> namenClone = (ArrayList<String>) namen.clone();
        Collections.sort(namen, String.CASE_INSENSITIVE_ORDER.reversed());

        System.out.println(namen);
        System.out.println(namenClone);
    }
}
