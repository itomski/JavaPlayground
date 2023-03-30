package de.lubowiecki.javaplayground.vererbung;

public class Fahrrad implements Fahrbar {

    @Override
    public void vor() {
        System.out.println("Fährt mit dem " + getClass().getSimpleName() + " vorwärts");
    }

    @Override
    public void zurueck() {
        System.out.println("Fährt mit dem " + getClass().getSimpleName() + " rückwärts");
    }

    public void reifenWechsel() {
        System.out.println("Der Reifen muss erneuert werden...");
    }
}
