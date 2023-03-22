package de.lubowiecki.javaplayground.designpatterns.sigleton;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private int zahl;

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    // Keine TopLevel-Klasse, darf static sein
    static class SubClass {
    }
}
