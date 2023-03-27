package de.lubowiecki.javaplayground;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {

    public static void main(String[] args) {

        // Wrapper geben primitiven Werten mehr Fähigkeiten

        // Die Collections arbeiten NUR mit Objekten, keine primitiven erlaubt
        List<Integer> zahlen = new ArrayList<>(); // Verwendet einen "Generischen" Typ
        zahlen.add(123); // primitive int wird zu Integer geboxt

        Integer i = Integer.valueOf(10);
        zahlen.add(i); // wird nicht geboxt - ist schon Integer

        //zahlen.add(10.0); // Error: double kann nicht (automatisch) zu Integer werden

        byte b = 10;
        // zahlen.add(b); // zuerst wird geboxt (byte zu Byte), danach komplex-widening (Byte zu Integer)
        // Komplex-Widening ist immer nur zum Elterntyp der Klasse möglich
        Byte b2 = 10; // Komplex
        zahlen.add(b2.intValue()); // Über eine Methode wird Byte zu int

    }
}