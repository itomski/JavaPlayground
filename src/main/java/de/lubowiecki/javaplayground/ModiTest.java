package de.lubowiecki.javaplayground;

public class ModiTest {

    public static void main(String[] args) {

        final int x = 10; // primitive Konstante
        //x = 11; // nicht möglich, da x final ist

        final int y; // Deklaration
        y = 25; // Initialisierung, danach nicht mehr änederbar

        int a,b,c; // Deklariert mehrere Variablen vom gleichen Typ

        //int a = 15; // Redeklaration (nicht erlaubt). Variable ist bereits deklariert
        a = 15; // braucht nur noch einen Wert

        int e = 17, f = 15; // Deklaration vom gleichen Typ inkl. Initialisierung

        final Robot r = new Robot("R2D2");
        //r = new Robot("C3PO"); // Kann nicht neu zugewiesen werden, da r final ist
        r.name = "C3PO"; // Zustand des Objekt kann geändert werden

        Robot r2 = new Robot("R2D2"); // Varibale ist nicht final
        r2 = new Robot("C3PO"); // Referenz darf geändert werden

    }
}
