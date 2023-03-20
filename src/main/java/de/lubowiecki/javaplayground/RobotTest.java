package de.lubowiecki.javaplayground;

public class RobotTest {

    public static void main(String[] args) {

        // new instanziert ein Objekt aus einer Klasse
        Robot r1 = new Robot("R2-D2"); // Instanzierung. Aus dem Bauplan wird ein konkretes Objekt
        System.out.println(r1); // automatisch wird die toString-Methode des Objektes verwendet
        r1.vor();
        r1.vor();
        r1.vor();
        r1.vor();
        System.out.println(r1);

        // Eigenschaft ist private = keine direkte Manipulation möglich
        //r1.position.x = 10; // direktes Verändern der Eigenschaften kann zum ungültigen Zustand des Objetes führen

        System.out.println("-------------");

        Robot r2 = new Robot("C3-PO", true); // Instanzierung. Aus dem Bauplan wird ein konkretes Objekt
        System.out.println(r2);

        r2.vor();
        r2.vor();
        System.out.println(r2);
        r2.zurueck();
        r2.zurueck();
        System.out.println(r2);

    }
}
