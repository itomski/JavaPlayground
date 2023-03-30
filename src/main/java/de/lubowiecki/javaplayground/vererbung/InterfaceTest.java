package de.lubowiecki.javaplayground.vererbung;

public class InterfaceTest {

    public static void main(String[] args) {

        Fahrrad f1 = new Fahrrad();
        f1.vor();
        f1.zurueck();
        f1.reifenWechsel();

        System.out.println();

        Fahrbar f2 = f1; // Fahrrad ist Fahrbar
        f2.vor(); // Methoden werden immer auf dem Objekt auf dem Heap ausgeführt
        f2.zurueck();
        // über f2 gibt es keinen ReifenWechsel

        System.out.println();

        Pferd p = new Pferd();
        p.vor();
        p.zurueck();
        p.hufeisenWechseln();

        System.out.println();

        f2 = p; // Pferd ist Fahrbar
        f2.vor();
        f2.zurueck();
        // hufeisenWechsel ist über das Interface nicht verfügbar

    }
}
