package de.lubowiecki.javaplayground.designpatterns.composite;

public class Circle extends AbstractElement {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y); // Ruft den Konstruktor der abstrakten Klasse auf
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                '}';
    }
}
