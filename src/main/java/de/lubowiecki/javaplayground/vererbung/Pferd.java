package de.lubowiecki.javaplayground.vererbung;

public class Pferd implements Fahrbar {


    @Override
    public void vor() {
        System.out.println("Im Galop vorwärts");
    }

    @Override
    public void zurueck() {
        System.out.println("Im Galop rückwärts");
    }

    public void hufeisenWechseln() {
        System.out.println("Die Hufeisen muss erneuert werden");
    }
}
