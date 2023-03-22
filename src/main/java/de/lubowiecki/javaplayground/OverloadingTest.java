package de.lubowiecki.javaplayground;

public class OverloadingTest {

    public static void main(String[] args) {
        new OverloadingTest().start();
        // hier ist das Objekt nicht mehr verfügbar
    }

    private void start() {

        print((byte)15);

        byte b = 22;
        print(b);

        print(10);
        print(10.0);
        print("10");
    }

    private void print(byte val) {
        System.out.println("byte: " + val);
    }

    // bei print(10) wird int val = 10 ausgeführt
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
