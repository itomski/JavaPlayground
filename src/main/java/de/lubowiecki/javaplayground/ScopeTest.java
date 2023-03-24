package de.lubowiecki.javaplayground;

public class ScopeTest {

    private static int zahl = 100; // Verfügbar ab der ersten Verwendung der Klasse bis zum Ende des Programms
    private int zahlInstance = 200; // Verfügbar ab der Instanzierung eines Objektes, bis zur der Entfernung durch GC

    public static void main(String[] args) {

        System.out.println(zahl); // Zeigt die Klassenvariable
        int zahl = 300;
        System.out.println(zahl); // Zeigt jetzt die lokale Variable. Die lokale Variable überdeckt die Klassenvariable
        System.out.println(ScopeTest.zahl); // Zeigt die Klassenvariable

        // Eine lokale Variable ist in dem Block sichtbar in dem sie erzeugt wurde
        // und in allen seinen Unterblöcken

        int i = 10; // Scope: die gesamte main-Methode

        {
            int[] arr = new int[100_000_000];
            arr[99_000_000] = 123;
            System.out.println(arr[99_000_000]);
        }

        if(true) {
            System.out.println(i);
            // int i = 20; // i ist noch sichtbar, kann daher nicht redeklariert werden
        }

        if(true) {
            int j = 200; // Scope: Nur der if-Block
        }

        int j = 300;

        machWas(20);
    }

    public void setZahlInstance(int zahl) {
        // zahlInstance ist die Instanzvariable
        // zahl ist die lokale Variable
        zahlInstance = zahl;
    }

    // Methoden Parameter sind lokale Variablen der Methode
    public void setZahlInstance2(int zahlInstance) {
        // Beide (Instanzvariable und lokale Variable) haben den gleichen Namen
        // Lokale Variable überlagert die Instanzvariable
        // this.zahlInstance ist die Instanvariable, nötig wenn es einen Namenskonflikt gibt
        this.zahlInstance = zahlInstance;
    }

    static void machWas(int i) {
        int j = 100;
        // Scope von i und j ist die machWas-Methode
    }

}
