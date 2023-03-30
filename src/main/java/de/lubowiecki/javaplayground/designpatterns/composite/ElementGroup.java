package de.lubowiecki.javaplayground.designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementGroup implements Element {

    private List<Element> elements;

    public ElementGroup(Element... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(Element element) {
        this.elements.add(element); // Fügt ein Element in die Liste ein
    }

    /*
    public void add(Element... elements) {
        this.elements.addAll(Arrays.asList(elements)); // Fügt alle Elemente des VarArgs in die Liste ein
    }

    public void remove(Element element) {
        this.elements.remove(element); // Entefrn ein Element aus der Liste
    }

    public void remove(Element... elements) {
        this.elements.removeAll(Arrays.asList(elements)); // Entfernt alle Elemente des VarArgs aus der Liste
    }
    */

    @Override
    public void moveTo(int x, int y) {
        for(Element e : elements) {
            e.moveTo(x, y);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ElementGroup [elements=");
        sb.append(elements);
        sb.append("]");
        return sb.toString();
    }
}
