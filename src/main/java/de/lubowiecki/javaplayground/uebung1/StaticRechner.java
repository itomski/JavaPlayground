package de.lubowiecki.javaplayground.uebung1;

import de.lubowiecki.javaplayground.statics.StaticTest;

public class StaticRechner {

    private static String protokol = "";

    private StaticRechner() {
    }

    public static double add(double a, double b) {
        double res = a + b;
        addToProtokol(a, b, "+", res);
        return res;
    }

    public static double sub(double a, double b) {
        double res = a - b;
        addToProtokol(a, b, "-", res);
        return res;
    }
    public static double multi(double a, double b) {
        double res = a * b;
        addToProtokol(a, b, "*", res);
        return res;
    }

    public static double div(double a, double b) {
        double res = a / b;
        addToProtokol(a, b, "/", res);
        return res;
    }

    private static void addToProtokol(double a, double b, String op, double res) {
        protokol += a + " " + op + " " + b + " = " + res + "\n";
    }

    public static String getProtokol() {
        return protokol;
    }
}
