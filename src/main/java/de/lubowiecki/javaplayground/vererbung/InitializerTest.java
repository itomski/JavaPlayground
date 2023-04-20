package de.lubowiecki.javaplayground.vererbung;

import java.io.IOException;

public class InitializerTest {

    static {
        int z = 100; // Lokale Variable
        x = z;
        //long[] zahlen = {};
        long[] zahlen = null;
        zahlen[3] = z;
    }

    int z = 11; // Instanzvariable
    int y = z;

    static int x; // Klassenvariable

    public static void main(String[] args) throws IOException {

        Bbb b = new Bbb();
        b = new Ccc();

        String x = "Moin";
        x += "Moin"; // x = x + "Moin";
        x += 10; // x = x + 10;

        byte by = 10;
        int arr1[] = new int[by]; // primitive Widening von byte zu int
        // Größe des Arrays wird mit int angegeben, long ist zu groß
        // Maximale größe eines Arrays ist Integer.MAX_VALUE
        //int arr2[] = new int[10l]; // long ist zu groß für die Länge
        //long arr3[] = new long[10l]; // primitive Widening von byte zu int

        /*
        try {

        }
        catch(IOException e) {

        }
        */
    }
}

class Aaa {

    static { // Static Initializer
        System.out.println("Aaa s");
    }

    { // Instanz Initializer
        System.out.println("Aaa i");
    }

    public Aaa() {
        System.out.println("Aaa c");
    }
}

class Bbb extends Aaa {

    public Bbb() {
        System.out.println("Bbb c");
    }

    static { // Static Initializer
        System.out.println("Bbb s");
    }

    { // Instanz Initializer
        System.out.println("Bbb i");
    }
}

class Ccc extends Bbb {

    { // Instanz Initializer
        System.out.println("Ccc i");
    }

    public Ccc() {
        System.out.println("Ccc c");
    }

    static { // Static Initializer
        System.out.println("Ccc s");
    }
}

