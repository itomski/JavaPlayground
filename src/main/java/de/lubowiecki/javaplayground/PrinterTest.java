package de.lubowiecki.javaplayground;

import java.util.Arrays;

public class PrinterTest {

    public static void main(String[] args) {

        String s = "Das ist das Haus von Nikigraus...";
        OutputHelper.print(s); // Aufruf einer statischen Methode
        OutputHelper.print(s);
        OutputHelper.print(s);
        OutputHelper.print(s);

        System.out.println(2 + 4);
        //System.out.println(taschenrechner.add(2, 4));

        // Bekannte Utility-Klassen
        // Arrays, Collections, Math

        /*
        OutputHelper outputHelper = new OutputHelper(); // geht nicht, da Konstruktor private
        outputHelper.print(s);
        */
    }
}
