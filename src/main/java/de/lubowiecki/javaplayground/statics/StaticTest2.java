package de.lubowiecki.javaplayground.statics;

public class StaticTest2 {

    // Sobald ein eigener Konstruktor definiert wird, ist der default Konstruktor nicht mehr verfügbar

    public StaticTest2(boolean debug) {
    }

    public StaticTest2() { // nötig, da durch den eigenen Konstruktor der default Konstruktor nicht mehr verfügbar
    }

    public static void main(String[] args) {

        // Instanzmethode (braucht eine Instanz d.h. Objekt)
        StaticTest2 st2 = new StaticTest2(); // default Konstruktor
        st2.machWas(); // Instanzmethode wird auf dem Objekt aufgerufen

        // Klassenmethode
        StaticTest2.machWasAnderes(); // Wird direkt auf der Klasse aufgerufen
        //StaticTest2.machWas(); // Kompiler-Error: Objekt nicht verfügbar

        st2.machWasAnderes(); // Die Klasse hinter dem Objekt wird ermittelt, Methode wird auf der Klasse ausgeführt


        StaticTest2 st2a = new StaticTest2(); // Objekt wird auf dem Heap erzeugt
        StaticTest2 st2b = new StaticTest2(); // Objekt wird auf dem Heap erzeugt
        st2b = null; // Referenz wird vom Objekt auf dem Heap getrennt, Objekt kann von GC entfernt werden
        st2b = st2a; // Beide Referenzen zeigen auf das gleiche Objekt auf dem Heap
    }

    public void machWas() { // Instanzmethode
        System.out.println("Hi");
    }

    public static void machWasAnderes() { // Klassenmethode
        // Können nur andere statische Eigenschaften oder Methoden der Klasse benutzen
        // Instanzvariablen und Methoden sind NICHT verfügbar
        System.out.println("Moin");
    }
}
