package de.lubowiecki.javaplayground;

import java.util.Arrays;
import static java.lang.System.out; // Importiert statische Variablen oder Methoden
import static java.lang.Math.*; // Importiert alle statische Variablen und Methoden von der Klasse Math

public class MainTest {

    public static void main(String[] args) {

        System.out.println(args.length); // Zeigt die Größe des String-Arrays (Sammlung)
        System.out.println(Arrays.toString(args)); // Arrays.toString zeigt den Inhalt des Arrays

        print(1,2,3,1,2,3,4,2,10);
        print();
    }

    public static void print(int... arr) { // es können 0, 1 oder mehrere Werte sein
        // System = Klasse
        // out = Variable/Eigenschaft die ein Objekt von PrintStream enthält
        // println() = Methode von dem PrintStream-Objekt im out
        System.out.println(Arrays.toString(arr));

        // nutzt das out von System
        //out.println(5 / 0); // ArithmeticException

        System.out.println(Math.PI);
        System.out.println(PI);
        System.out.println(random()); // random ist eine statische Methode von Math

        // Statische Eigenschaften und Methoden gehören nicht einem Objekt, sondern der Klasse d.h. dem Bauplan
        // Will ich eine statische Eigenschaft/Methode benutzen brauche ich KEIN Objekt
        // Aufruf erfolgt direkt auf der Klasse

        // ceil = Aufrunden
        // round = Kaufmännisch runden
        System.out.println(floor(random() * 6) + 1); // floor = Abrunden (Methode von Math)
    }
    /*
    public static void print(int i, int j) {
        System.out.println(i + "," + j);
    }
    */
}
