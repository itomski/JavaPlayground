package de.lubowiecki.javaplayground.vererbung;

public class PolyTest {

    public static void main(String[] args) {

        Bcd b1 = new Bcd();

        // Ein Objekt der Kind-Klasse ist auch immer ein Objekt vom Typ der Elternklasse
        Bcd b2 = new NextBcd(); // NextBcd IS-A Bcd

        // Ein Objekt der Eltern-Klasse ist NICHT immer ein Objekt vom Typ der Kind-Klasse
        // NextBcd b3 = new Bcd(); // Bcd IS-A NextBcd

        NextBcd b4 = new NextBcd();
        Bcd b5 = b4; // Referenz ist vom Typ der Elternklasse, Objekt vom Typ der Kindklasse
        NextBcd b6 = (NextBcd) b5; // Casting möglich, wenn der Objekttyp von b5 wirklich NextBcd ist

    }
}

class Bcd {

    void machWas() {
        System.out.println("Bcd");
    }
}

class NextBcd extends Bcd {

    void machWas() {
        System.out.println("NextBcd");
    }
}
