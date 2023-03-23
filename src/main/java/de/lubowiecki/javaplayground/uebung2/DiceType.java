package de.lubowiecki.javaplayground.uebung2;

public enum DiceType {

    W6, W10, W20, W100;

    /*
    W6(6), W10(10), W20(20), W100(100);

    private final int eyes;

    DiceType(int eyes) { // Konstruktor
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }
    */

    public int getEyes() {
        return Integer.parseInt(this.toString().substring(1));
    }
}
