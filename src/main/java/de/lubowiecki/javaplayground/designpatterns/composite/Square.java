package de.lubowiecki.javaplayground.designpatterns.composite;

public class Square extends AbstractElement {

    private int height;

    private int width;

    public Square(int x, int y, int height, int width) {
        super(x, y); // Ruft den Konstruktor der abstrakten Klasse auf
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
