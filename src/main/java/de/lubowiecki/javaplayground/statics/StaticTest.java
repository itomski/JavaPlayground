package de.lubowiecki.javaplayground.statics;

public class StaticTest {

    public static void main(String[] args) {

        System.out.println(Box.counter); // Ausgabe der statischen Eigenschaft counter aus Box

        Box b1 = new Box("Das ist das Haus von Nikigraus");
        System.out.println(Box.counter);
        Box b2 = new Box("Das ist das Haus von Peter");
        System.out.println(Box.counter);
        Box b3 = new Box("Das ist das Haus von Hans");
        System.out.println(Box.counter);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(Box.counter); // Ausgabe der statischen Eigenschaft counter aus Box
    }
}
