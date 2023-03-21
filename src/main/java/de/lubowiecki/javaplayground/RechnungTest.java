package de.lubowiecki.javaplayground;

import de.lubowiecki.javaplayground.Rechnung;

public class RechnungTest {

    public static void main(String[] args) { // Einstieg in das Programm
        Rechnung rg1 = new Rechnung("AB123456", 100.99);

        int i = 100; // Zuweisung. Variable kann nur einen Wert aufnehmen
        i = 200; // Neu Zuweisung, der alte Wert ist weg

        int[] zahlen = {1,5,7,9,22,18}; // Array, kann mehrere Werte gleichen Typs aufnehmen
        zahlen[0] = 15; // Ändert den Wert an Position 0, 1 wirg gegen 15 ausgetauscht

        //rg1.betrag = -100.12345; // Eigenschaft ist private, direkte Änderung ist nicht mehr möglich
        //rg1.nr = null;

        //rg1.setNr("AB2349"); // Setter nicht verfügbar
        rg1.setBetrag(-250.99);
        rg1.setBetrag(150.99);
        rg1.setBetrag(2.99);

        //System.out.println(rg1); // toString wird benutzt
    }
}
