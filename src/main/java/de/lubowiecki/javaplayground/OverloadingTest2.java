package de.lubowiecki.javaplayground;

import java.util.Arrays;

public class OverloadingTest2 {

    public static void main(String[] args) {
        new OverloadingTest2().start();
    }

    private void start() {

        machWas();

        // Wenn eine passende Methode für primitiven Typ nicht da ist: Auto-Boxing zu Integer
        machWas(1);

        // Wenn eine passende Methode für komplexen Typ nicht da ist: Auto-Un-Boxing zu int
        machWas(Integer.valueOf(2));

        machWas(5, 7); // int int
        machWas(5, 7.0); // int double
        machWas(5.0, 7); // double int

        // gibt es keine Methode mit passenden primitiven wird als erstes primitive Widening versucht
        // gibt es keine Methode mit passenden primitiven (trotz Widening) wird Auto-Boxing versucht
        // primitive Widening und Autoboxing zusammen gibt es NICHT!

        machWas(1,2,3,4,9,22,-15); // VarArg
        machWas(); // VarArg Methoden werden IMMER als letzte Option verwendet

    }

    /*private void machWas(int i) {
        System.out.println("int");
    }*/

    private void machWas(double i) {
        System.out.println("double");
    }

    private void machWas(Integer i) {
        System.out.println("Integer");
    }

    /*
    private void machWas(int i, int j) {
        System.out.println("int, int");
    }

    private void machWas(int i, double j) {
        System.out.println("int, double");
    }

    private void machWas(double i, int j) {
        System.out.println("double, int");
    }
    */

    private void machWas(double i, double j) {
        System.out.println("double, double");
    }

    private void machWas() {
        System.out.println("Ohne Parameter");
    }

    private void machWas(int... werte) { // i ist ein Array von Werten
        System.out.println("VarArgs" + Arrays.toString(werte));
        for(int j = 0; j < werte.length; j++) {
            System.out.println(werte[j]);
        }
    }
}

