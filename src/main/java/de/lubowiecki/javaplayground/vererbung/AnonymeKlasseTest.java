package de.lubowiecki.javaplayground.vererbung;

import de.lubowiecki.javaplayground.orm.Product;

import java.util.ArrayList;
import java.util.List;

public class AnonymeKlasseTest {

    public static void main(String[] args) {

        // Anonyme Klasse: Implementiert das Interface und wird sofort instanziert.
        // Ist NICHT wiederverwendbar
        Xyz x = new Xyz() {

            @Override
            public void machWas() {

            }

            @Override
            public void machWasAnderes() {

            }
        };

        // Anonyme Klasse geht mit Interfaces, abstrakten Klassen und konkreten Klassen
        // Elternklasse darf belibiges Inventar haben
        // abstrakte Mehoden müssen eingebaut werden
        Xyz2 x2 = new Xyz2() {
            @Override
            public void machWas() {
                System.out.println("HALLOOOOOOO.....");
            }
        };

        // Lambda geht nur mit Interfaces
        // Das Interface MUSS nur eine einizige abstrakte Methode enthalten
        Xyz2 x3 = () -> System.out.println("HALLOOOOOOO.....");

        char c = 'a';
        //char c = 123;
        c++; // c = (char)(c + 1)
        byte b = 123;

        float f = 10.0f;
        double d = 10.0;

        System.out.println();

        Produkt p = new Produkt();
        p.buy();
        p.sell();

        System.out.println();

        Kaufbar k = p;
        k.buy();
        // k.sell(); // Error: Methode ist nicht in Kaufbar enthalten!

        System.out.println();

        Verkaufbar v = p;
        // v.buy(); // Error: Methode ist nicht in Verkaufbar enthalten!
        v.sell();

        System.out.println();

        Verkaufbar v2 = () -> System.out.println("Verkaufe Lambda");
        v2.sell();

        System.out.println();

        Kaufbar k2 = new Kaufbar() {
            @Override
            public void buy() {
                System.out.println("Kaufe Anonyme Klasse");
            }
        };
        k2.buy();

        System.out.println();

        Kaufbar k3 = new Nilpferd();
        k3.buy();

        System.out.println();

        List<Kaufbar> objList = new ArrayList<>();
        objList.add(new Nilpferd());
        objList.add(new Produkt());
        objList.add(1, k2); //int add(int i, Kaufbar o)

        for (Kaufbar kaufbar : objList) {
            System.out.println(kaufbar.getClass().getSimpleName());
            //kaufbar.buy();
            switch(kaufbar.getClass().getSimpleName()) {
                case "Nilpferd":
                    System.out.println("AAAAAA");
                    break;

                case "Produkt":
                    System.out.println("BBBB");
                    break;

                default:
                    System.out.println("CCCCCCC");

            }
        }
    }
}

interface Xyz {

    void machWas();

    void machWasAnderes();

}

interface Xyz2 {

    void machWas();

}

interface Kaufbar {
    void buy();
}

interface Verkaufbar {
    void sell();
}

class Produkt implements Kaufbar, Verkaufbar {

    @Override
    public void buy() {
        System.out.println("Kaufe Produkt");
    }

    @Override
    public void sell() {
        System.out.println("Verkaufe Produkt");
    }
}

class Nilpferd implements Kaufbar {

    @Override
    public void buy() {
        System.out.println("Kaufe Nilpferd");
    }

    public void frisst() {
        System.out.println("Frisst...");
    }
}
