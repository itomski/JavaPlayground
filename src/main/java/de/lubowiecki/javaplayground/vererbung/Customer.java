package de.lubowiecki.javaplayground.vererbung;

public class Customer extends Person {

    private String id;

    public Customer() {
        super(true); // automatisch wird nur der parameterlose Konstruktor verwendet, andere müssen explizit aufgerufen werdeen
        // super(); // Konstruktor der Elternklasse wird aufgerufen
        System.out.println("Const Customer");
        // super // Referenz auf ein Objekt der Elternklasse
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
