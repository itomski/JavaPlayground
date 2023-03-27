package de.lubowiecki.javaplayground;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class InitBox {

    private static boolean vormittag;
    private static int[] rands = new int[10];

    private final int zahl; // Muss spätestens im Konstruktor initialisiert werden

    // Klassen Initializer
    static { // Wird 1x ausgeführt, sobald die Klasse geladen wird. Kann nur statisches Inventar benutzen
        // Init für statische Variablen
        System.out.println("Klass INIT");
        vormittag = LocalDateTime.now().getHour() <= 12;

        Random rand = new Random();
        for(int i = 0; i < rands.length; i++)
            rands[i] = rand.nextInt(10) + 1;

    }

    // Instanz Initializer
    { // Wird bei jeder Instanzierung ausgeführt. Kann statisches und Instanz-Inventar benutzen
        System.out.println("Instanz INIT");
    }

    // Konstruktor
    public InitBox() {
        System.out.println("Instanz Konstruktor");
        System.out.println(vormittag);
        System.out.println(Arrays.toString(rands));
        zahl = 10;
    }

    void machWas() {
        System.out.println("Hi");
        return; // Hier wird die Mehode verlassen
        //System.out.println("Hallo"); // Kompiler-Error: Code nicht erreichbar
    }

    void machWasAnderes() {
        System.out.println("Hi");

        boolean exit = true; // Variable: Wird zur Laufzeit auf Wert geprüft

        if(exit) { // Kopiler sieht nur den Datentyp, nicht den wert
            return; // Hier wird die Mehode verlassen
        }
        System.out.println("Hallo");
    }

    void machWasGanzAnderes() {
        System.out.println("Hi");

        // Kompiletime-Konstante
        final boolean exit = true; // Initialisierte Konstanten werden zur Kompile-Zeit ausgewertet

        while(exit) { // Endlosschleife
        }
        //return; // Nicht erreichbar
    }

    void machWasGanzAnderes2() {
        System.out.println("Hi");

        boolean exit = true; // Wird zur Laufzeit ausgewertet

        // Im Kompilat steht an Stelle der exit-Variable der konkrete Wert (true)
        while(exit) { // Endlosschleife
        }
        return;
    }

    void machWasGanzAnderes3() {
        System.out.println("Hi");

        // Runtime-Konstante
        final boolean exit;
        exit = true; // Wertzuweisung findet zur Laufzeit statt

        while(exit) { // Endlosschleife
        }
        return;
    }
}
