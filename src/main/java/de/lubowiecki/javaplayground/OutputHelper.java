package de.lubowiecki.javaplayground;

// UtilityKlassen enthalten nur statischer Eigenschaften und Methoden
public class OutputHelper {

    private OutputHelper() {
    }

    public static void print(String str) {
        // \n neue Zeile
        // \t Tab
        // \r an den Anfang der Zeile gehen
        System.out.print("**********************************************\n\r");
        System.out.println("\t" + str);
        System.out.println("**********************************************");
    }
}
