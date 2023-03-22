package de.lubowiecki.javaplayground;

public class OverloadingTest {

    public static void main(String[] args) {
        new OverloadingTest().start();
        // hier ist das Objekt nicht mehr verfügbar
    }

    private void start() {
        print(10);
        print(10.0);
        print("10");
    }

    private void print(int val) {
        System.out.println("int: " + val);
    }

    private void print(double val) { // Überladene Methode
        System.out.println("double: " + val);
    }

    private void print(String val) { // Überladene Methode
        System.out.println("String: " + val);
    }
}
