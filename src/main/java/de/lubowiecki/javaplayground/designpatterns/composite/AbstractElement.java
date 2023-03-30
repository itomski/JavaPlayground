package de.lubowiecki.javaplayground.designpatterns.composite;

public abstract class AbstractElement implements Element {

    private int x;

    private int y;

    public AbstractElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
