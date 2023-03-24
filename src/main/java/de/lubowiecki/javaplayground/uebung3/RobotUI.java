package de.lubowiecki.javaplayground.uebung3;

public class RobotUI {

    public static void main(String[] args) {

        Robot r = new Robot("R2D2");

        r.drehungLinks();
        System.out.println(r.getRichtung());

        r.drehungRechts();
        System.out.println(r.getRichtung());
    }
}
