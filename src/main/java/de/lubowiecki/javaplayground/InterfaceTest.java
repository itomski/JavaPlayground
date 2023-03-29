package de.lubowiecki.javaplayground;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {

        // ArrayList: Default Größe des internen Arrays ist 10
        List<Movable> list = new ArrayList<>();
        list.add(new Truck());
        list.add(new Ship());

        // Es gibt kein internes Array
        list = new LinkedList<>(list); // Wechsel von ArrayList auf LinkedList

        list.add(1, new Ship());
        list.remove(0);
        list = new ArrayList<>(list); // Wechsel von LinkedList auf ArrayList
        Movable m1 = list.get(2);

        for (Movable m: list) {
            m.move(10, 15);
        }
    }
}

interface Movable {

    // Alle Eigenschaften im Imterface sind public static final

    // Beschreibt die öffentliche Schnittstelle
    // Alle Methoden sind automatisch public
    void move(int x, int y); // Methode ist abstrakt, d.h. wird nicht ausprogrammiert
}

class Ship implements Movable {

    private int x;
    private int y;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y= y;
    }
}

class Truck implements Movable {

    private Point pos;

    @Override
    public void move(int x, int y) {
        pos = new Point(x, y);
    }
}