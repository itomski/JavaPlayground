package de.lubowiecki.javaplayground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SchleifenTest2 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();

        int i = 0;
        for (; i < 10;) {
            System.out.print(i + ", ");
            i++;
        }

        System.out.println();

        int j = 0;
        for (;;) { // Endlosschleife
            System.out.print(".");
            if(++j == 20) break;
        }

        System.out.println();

        //for (;;System.out.print(".")); // Endlosschleife

        for (int k = 0; k < 100; System.out.print(k++)); // Endlosschleife

        System.out.println();

        // List<String> namen = List.of("Peter", "Carol", "Bruce", "Natasha", "Steve", "Tony"); // seit Java 9 (1.9)
        List<String> namen = Arrays.asList("Peter", "Carol", "Bruce", "Natasha", "Steve", "Tony"); // in Java 8 und davor

        for(int k = 0; k < namen.size(); k++) {
            System.out.print(namen.get(k) + ", "); // Nur Arrays und Listen haben einen Index
        }

        System.out.println();

        for(String n : namen) {
            System.out.print(n + ", ");
        }

        System.out.println();

        //String n; // Variable darf nicht außerhalb des Loop-Heads erzeugt werden
        for(String n : namen) {
            // n ist eine Referenz auf das aktuelle element in der Collection/Array
            System.out.print(n + ", ");
        }

        System.out.println();

        // Lambdas und Streams seit Java 8
        namen.forEach(n -> System.out.print(n + ", "));

        /* in JavaScript
        var machWas = function(n) {
            // ...
        }

        var machWas = function(n) {
            console.log(n);
        }

        let machWas = n => console.log(n);

        machWas(100);
        */

        System.out.println();

        // Stream
        namen.stream()
                .map(n -> n.toUpperCase())
                .filter(n -> n.length() <= 5)
                .forEach(n -> System.out.print(n + ", "));


        System.out.println();

        int k = 0;
        while(k < 100) {
            System.out.println(k);
            k++;
        }

        long oneMinute = System.currentTimeMillis() + 20 * 1000;

        while(System.currentTimeMillis() <= oneMinute) {
            System.out.println("warten...");

            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();

        Iterator<String> itr = namen.iterator(); // Am anfang steht der Curor des Iterators VOR dem ersten Wert
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
