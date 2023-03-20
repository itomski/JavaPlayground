package de.lubowiecki.javaplayground;

import java.time.LocalDate;

// Klasse
public class App { // Konvention für Klassennamen: beginnen mit Großbuchstaben, danach CamelCase

    // Konvention für Variablen: beginnen mit Kleinbuchstaben, danach CamelCase
    int zahl;

    // Konstante, können nachträglich nicht mehr geändert werden
    final double PI = 3.14; // Konvention für (öffentlich) Konstanten: Werden nur in Großbuchstaben geschrieben, SCREAMING_SNAKE_CASE

    // Konvention für Methoden: beginnen mit Kleinbuchstaben, danach CamelCase
    // Methode: Funktion die zu einer Klasse gehört
    // main-Methode ist der Einstiegspunkt in die Anwendung
    public static void main(String[] args) { // void = keine Rückgabe

        System.out.println("Hallo Welt"); // sout

        // summe ist eine Variable
        // in summe wird das Ergebnis der Methode aufgefangen
        int summe = addieren(10, 15); // Verwendung der Methode
        System.out.println("Summe: " + summe);

        System.out.println("Summe2: " + addieren(33, 17));
        // return 10; // nicht erlaubt, Rückgabetyp ist void (nichts)

        byte zahl = 127; // -128 bis 127
        zahl++; // zählt die zahl um 1 hoch

        System.out.println(zahl);

        var sum = 100;
        // sum ist automatisch int
        // Initialisierung = erste Zuweisung
        // sum = 10.5; // geht nicht, sum ist bei der Initialisierung mit int belegt worden

        // Alle Klassen die in anderen Paketen liegen, müssen importiert werden
        // Ausnahme: Paket java.lang

        // LocalDate: komplexer Datentyp
        // data: Name der Variable
        LocalDate date; // Deklaration
        date = LocalDate.now(); // = ist eine Zuweisung, Initialisierung = erste Zuweisung
        date = date.plusDays(2); // Keine Initialisierung. Neuzuweisung

        LocalDate date2 = LocalDate.now(); // Deklaration und Initialisierung in einem
        date2 = date2.plusDays(2); // Neuzuweisung
    }

    // Methoden Definition
    public static int addieren(int a, int b) {
        return a + b;
        //return 10.5; // nicht erlaubt, Rückgabetyp ist int (Ganzzahl)
    }
}
