package de.lubowiecki.javaplayground.vererbung;

import java.time.LocalDate;

public class VererbungTest {

    public static void main(String[] args) {

        //Person p = new Person();
        // Jedes Objekt erbt Methoden von Object

        Customer c = new Customer();
        c.setFirstname("Bruce");
        c.setLastname("Baner");
        c.setBirthDate(LocalDate.of(2000, 7, 22));
        c.setId("XBB12345");

        System.out.println(c);

        // IS-A Beziehungen. Ein Objekt ist vom Typ aller Klassen, von denen er erbt
        System.out.println(c instanceof Customer);
        System.out.println(c instanceof Person);
        System.out.println(c instanceof Object);

        Person p = c; // Da Customer auch eine Person ist, ist diese Zuweisung ok
        // Über die p sind nur eigenschaften und Methoden nutzbar, die in Person definiert wurden

        Object o = c;

        Customer cust = (Customer) o; // Der Cast erlaubt wieder den Zugriff auf alle Eigenschaften und Methoden

        // Objekt auf dem Heap ändert seine Indentität nicht

        // Alle Instanzmethoden werden immer auf dem Objekt auf dem Heap ausgeführt
        System.out.println(o);

    }
}
