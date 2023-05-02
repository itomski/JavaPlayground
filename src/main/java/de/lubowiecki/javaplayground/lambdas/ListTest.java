package de.lubowiecki.javaplayground.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Box> boxen = new ArrayList<>();
        boxen.add(new Box(100));
        boxen.add(new Box(20));
        boxen.add(new Box(33));
        boxen.add(new Box(50));
        boxen.add(new Box(120));
        boxen.add(new Box(10));
        System.out.println(boxen);

        Collections.sort(boxen); // Objekte müssen vergleichbar sein
        System.out.println(boxen);

        System.out.println();

        // Realisierung von: int compare(T o1, T o2);
        Comparator<Box> c = (o1, o2) -> o1.getMaxCapacity() - o2.getMaxCapacity();

        boxen.sort(c); // Verlangt einen Comparator
        System.out.println(boxen);

        System.out.println();

        //boxen.sort((a, b) -> b.getMaxCapacity() - a.getMaxCapacity()); // Verlangt einen Comparator
        boxen.sort(c.reversed()); // Verlangt einen Comparator
        System.out.println(boxen);
    }
}

class Box implements Comparable<Box> {

    private final int maxCapacity;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        return "Box{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }

    // Kann pro Objekt nur ein einziges mal eingebaut werden
    // Ist die Natural-Order
    @Override
    public int compareTo(Box other) {
        return getMaxCapacity() - other.getMaxCapacity();
    }
}
