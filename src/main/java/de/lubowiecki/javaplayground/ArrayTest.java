package de.lubowiecki.javaplayground;

import de.lubowiecki.javaplayground.uebung2.DiceCup;
import de.lubowiecki.javaplayground.uebung2.DiceType;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup(DiceType.W6);

        // Array von primitiven ints
        // Arrays sind IMMER FixedSize-Speicher
        int[] zahlen = new int[10_000_000]; // 10 ist die Größe des Arrays
        zahlen[0] = 100; // Array-Index beginnt bei 0
        zahlen[9] = 100; // Letzter Index ist Größe -1
        // ArrayIndexOutOfBoundsException wenn Position nicht vorhanden

        long start = System.currentTimeMillis(); // Aktuelle Zeit in Millisekunden

        // Beim ersten Durchlauf wird i deklariert und mit 0 initialisiert
        // Bei jedem Durchlauf wird die mittlere Bedingung geprüft
        // Bei true wird der Body/Block ausgeführt
        // danach wird i verändert
        for(int i = 0; i < zahlen.length; i++) { // Schleife
            zahlen[i] = cup.roll();
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");

        int[] arr = {1,7,9,22,15,18}; // [1,7,9,22,15,18] Size 6
        arr = new int[7]; // [0,0,0,0,0,0,0] Size 7

        //int[] arr2;
        //arr2 = {1,7,9,22,15,18}; // nicht erlaubt! Geht nur bei gleichzeitiger Deklaration und Initialisierung

        //arr = {1,5,7}; // Auch nicht erlaubt
        arr = new int[]{1,5,7}; // so gehts!

        System.out.println(arr.length); // Jedes Array hat eine length Eigenschaft
        System.out.println(arr); // toString

        //System.out.println(Arrays.toString(zahlen)); // Gibt den Inhalt des Arrays als String aus

        int arr3[] = {2,8,9,17,22};

        byte[] a, b, c; // 3 byte-Array Variablen deklariert
        byte d, e[], f; // 1 byte-Array Variable und 2 byte Variablen deklariert

        // Array von String-Objekten
        String[] namen = {"Peter", "Carol", "Natasha", "Bruce", "Tony"};

        // Array von Integer-Wrapper-Objekten
        Integer[] zahlen2 = {1,2,3,4,5,6};

        Robot[] robots = new Robot[5];
        robots[0] = new Robot("R2D2");
        robots[1] = new Robot("C3PO");
        robots[2] = new Robot("HAL2000");
        robots[3] = new Robot("Bender");
        robots[4] = new Robot("T-1000");

        for (Robot r: robots) { // Verkürzte Schreibweise für Sammlungen
            System.out.println(r);
        }

        // Referenztyp      // Objekttyp
        Object obj = new Robot("ABC");
        Robot r1 = (Robot) obj;

        Object[] arr4 = new Object[3];
        arr4[0] = "Hallo!"; // String IS-A Object
        arr4[1] = 123; // int Auto-Boxing auf Integer und Integer IS-A Object
        arr4[2] = new Robot("C3PO"); // Robot IS-A Object

        for (Object o: arr4) {
            System.out.println( ((Robot) arr4[2]).name );
        }

        int i = 10;
        int j = i; // Kopie des Wertes wird in j abgelegt, weil primitiv

        Robot r3 = new Robot("ABCD");
        Robot r4 = r3; // Das Objekt von r3 wird von r4 referenziert. Es gibt 2 Referenzen auf das gleiche Objekt

        machWas(r3);
    }

    // Primitive Werte werden immer als Wert-Kopie (value) weitergegeben
    // Komplexe (Objekt) Datentypen werden immer als Referenz-Kopie (reference) weitergegeben

    static void machWas(Robot r) {
        // r ist Referenz auf das gleiche Objekt auf dem Heap wie r3
    }
}
