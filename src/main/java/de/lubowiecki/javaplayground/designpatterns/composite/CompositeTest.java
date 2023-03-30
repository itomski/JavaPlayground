package de.lubowiecki.javaplayground.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Element e1 = new Circle(10, 15, 20);
        System.out.println(e1);
        e1.moveTo(25, 100);
        System.out.println(e1);

        Element e2 = new Square(0, 0, 25, 100);
        System.out.println(e2);
        e2.moveTo(25, 100);
        System.out.println(e2);

        ElementGroup group = new ElementGroup(e1, e2);
        group.moveTo(200, 200);

        System.out.println(e1);
        System.out.println(e2);

        ElementGroup group2 = new ElementGroup();
        group2.add(new Square(100, 100, 20, 100));
        group2.add(new Square(100, 100, 30, 100));
        group2.add(new Square(100, 100, 40, 100));
        group2.add(new Circle(100, 100, 50));
        group2.add(new Circle(100, 100, 70));
        group2.add(group);

        System.out.println();

        group2.moveTo(1000, 1000);
        System.out.println(group2);


    }
}
