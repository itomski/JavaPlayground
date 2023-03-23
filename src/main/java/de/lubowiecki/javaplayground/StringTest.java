package de.lubowiecki.javaplayground;

public class StringTest {

    private static String s1; // null

    public static void main(String[] args) {

        // Strings sind Immutable (d.h. nicht veränderbar)
        String s2 = "ABCD";
        String s3 = "ABCD";
        s2 = "CDEFG"; // String Objekt wird nicht verändert. Es wird ein neuer Sting gebaut und die Referenz geändert
        s2.toLowerCase();
        s2 = s2.toLowerCase();
        //System.out.println("Nikigraus");

        System.out.println(s2 == s3); // == prüft, ob es das gleiche Objekt auf dem Heap ist
        System.out.println(s2.equals(s3)); // bei komplexen Datentypen erfolgt Wertevergleich mit equals

        int i1 = 10;
        int i2 = 10;
        //System.out.println(i1.equals(i2)); // sind keine Objkte, daher gibt es keine Methoden
        System.out.println(i1 == i2); // bei primitiven erfolgt Wertevergleich mit ==

        // Wrapper-Typen sind komplex
        Integer i3 = 10; // Wrapper-Objekt legt sich um den primitiven Wert herum
        int j1 = 10;
        i3 = j1; // Auto-Boxing von int in Integer
        j1 = i3; // Auto-Un-Boxing von Integer in int
        // Zum Rechnen werden Wrapper-Typen IMMER in primitive ausgepackt

    }
}
