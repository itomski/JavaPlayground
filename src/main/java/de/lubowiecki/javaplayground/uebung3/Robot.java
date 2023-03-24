package de.lubowiecki.javaplayground.uebung3;

public class Robot {

    private String name;

    private int x;
    private int y;

    private int richtung; // 0 = O, 1 = S, 2 = W, 3 = N

    private static final String[] RICHTUNGEN = {"Osten", "Süden", "Westen", "Norden"};

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void drehungLinks() {
        richtung = (richtung + 3) % 4;
    }

    public void drehungRechts() {
        richtung = ++richtung % 4;
    }

    public String getRichtung() {
        return RICHTUNGEN[richtung];
    }
}
