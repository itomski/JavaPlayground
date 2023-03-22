package de.lubowiecki.javaplayground;


import de.lubowiecki.javaplayground.uebung1.StaticRechner;

import java.util.Objects;

public class Datentypen {

    private int x; // Standardwert = 0;

    public static void main(String[] args) {

        int x = 100;
        double y = x; // primitive widening
        int z = (int) y; // ohne Cast nicht möglich, narrowing

        x = 1000;
        //byte b = 129; // zu groß
        byte b = 125;
        StaticRechner.add(x, 125); // An Methoden können sowohl Variablen als auch Literale übergeben werden

        System.out.println("Hallo Welt");
        String s = "Das ist ein Haus"; // Literal, landet im String-LITERAL-Pool

        //b = x; // x ist int, b ist byte
        b = (byte)x; // möglich, kann aber zum Über- oder Unterlauf führen
        System.out.println(b);

        System.out.println(100); // int ist der Standardtyp für Ganzzahlenliterale
        System.out.println(10.0); // double ist der Standardtyp für Zahlen mit Nachkommastelle

        float f = 100.0f; // floats werden mit f bereitgestellt
        long l = 100; // primitive widening von int auf long
        l = 100l; // erzeugt direkt ein long

        char c = 'A'; // stellt ein Unicode Zeichen da

        // byte < short < int < long < float < double
        //         char < int

        x = c;
        System.out.println(x);
        System.out.println((char)++x);


        // Standardwerte werden nur bei Instanz und Klassenvariablen vergeben
        // Lokale Variablen bekommen KEIN default Wert d.h. sie müssen vor der Verwendung initialisiert werden
        boolean b2;
        b2 = false;
        System.out.println(b2);

        long l2 = 1_000_000_000_000_000_000l;
        float f2 = 10.0f;

        // Zahlensystem
        int i2 = 16; // dezimal
        i2 = 016; // oktal: 14, beginnt mit 0
        i2 = 0b101; // binär: 5, beginnt mit 0b
        System.out.println(i2);
        System.out.println(Integer.toBinaryString(i2)); // dezimal wird in Binär-String umgewandelt
        i2 = 0x1f; // hex: 31, beginnt mit 0x
        System.out.println(i2);

        float f4 = 10.1234f;
        float f5 = 7.1234f;
        float erg = f4 / f5; // Nachkommastellen gehen verloren

        double d4 = 10.1234;
        double d5 = 7.1234;
        double erg2 = d4 / d5; // Nachkommastellen gehen verloren, aber es stehen doppelt so viele zur Verfügung

        int erg3 = 10 / 4; // Verliert die Nakommastelle
        System.out.println(erg3);

        double erg4 = 10.5 / 3; // kleiner typ muss auf dem größeren promovieren

        // wenn datentypen kleiner als int werden bei Math-Operationen automatisch die Opereanden auf int angehoben
        byte b3 = 10;
        byte b4 = 20;
        //byte erg5 = b3 + b4; // Operanden werden mind. zu int
        int erg6 = b3 + b4;

        b3 += 10; // b3 = (byte)(b3 + 10);
        b3 = 120;
        b3 += 100; // Überlauf
        System.out.println("###: " + b3);

        b3++; // b3 = (byte)(b3 + 1);

        Object o = new Object(); // ist ein leeres Objekt
        System.out.println(o); // toString
        System.out.println(o.hashCode());

        System.out.println("-------------");

        String s2 = "Hallo Welt"; // Landet im Pool
        System.out.println(s2.hashCode());
        String s3 = new String("Hallo Welt"); // Landet NICHT im Pool
        System.out.println(s3.hashCode());
        System.out.println(s2 == s3); // vergleicht, ob es das gleiche Objekt ist
        System.out.println(s2.equals(s3)); // vergleicht, ob es den gleichen Inhalt hat

        System.out.println("-------------");

        Xyz x2 = new Xyz(10);
        System.out.println(x2.hashCode());
        Xyz x3 = new Xyz(10);
        System.out.println(x3.hashCode());
        System.out.println(x2 == x3);
        System.out.println(x2.equals(x3));

    }
}

class Xyz { // erbt automatisch von Object

    private int zahl;

    private int nr;

    public Xyz(int zahl) {
        this.zahl = zahl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Xyz xyz = (Xyz) o;
        return zahl == xyz.zahl && nr == xyz.nr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zahl, nr);
    }
}
