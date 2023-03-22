package de.lubowiecki.javaplayground.uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        System.out.println("---- STATISCH ----");

        System.out.println(StaticRechner.add(1,2));
        System.out.println(StaticRechner.add(5,7));
        System.out.println(StaticRechner.sub(17,22));
        System.out.println(StaticRechner.sub(18,1));
        System.out.println(StaticRechner.multi(5,5));
        System.out.println(StaticRechner.multi(17,123));
        System.out.println(StaticRechner.div(10,2));
        System.out.println(StaticRechner.div(125,17));

        System.out.println(StaticRechner.getProtokol());

        System.out.println("---- INSTANZ ----");

        Rechner r1 = new Rechner();
        Rechner r2 = new Rechner();

        System.out.println(r1.add(1,2));
        System.out.println(r1.add(5,7));
        System.out.println(r2.sub(17,22));
        System.out.println(r2.sub(18,1));
        System.out.println(r1.multi(5,5));
        System.out.println(r1.multi(17,123));
        System.out.println(r2.div(10,2));
        System.out.println(r2.div(125,17));

        System.out.println("---- R1 ----");
        System.out.println(r1.getProtokol());

        System.out.println("---- R2 ----");
        System.out.println(r2.getProtokol());
    }
}
