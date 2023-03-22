package de.lubowiecki.javaplayground.uebung1;

public class Rechner {

    private String protokol = "";

    public double add(double a, double b) {
        double res = a + b;
        addToProtokol(a, b, "+", res);
        return res;
    }

    public double sub(double a, double b) {
        double res = a - b;
        addToProtokol(a, b, "-", res);
        return res;
    }
    public double multi(double a, double b) {
        double res = a * b;
        addToProtokol(a, b, "*", res);
        return res;
    }

    public double div(double a, double b) {
        double res = a / b;
        addToProtokol(a, b, "/", res);
        return res;
    }

    private void addToProtokol(double a, double b, String op, double res) {
        //protokol += a + " " + op + " " + b + " = " + res + "\n";
        protokol += String.format("%f %s %f = %f \n", a, op, b, res);
    }

    public String getProtokol() {
        return protokol;
    }
}
