package de.lubowiecki.javaplayground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest {

    private int[] arr = {7,9,22,18,6,5,18,33};

    public static void main(String[] args) {
        new ExceptionTest().start();
    }

    private void start() {
        machWas();
    }

    private void machWas() {

        System.out.println("Das ist ein Text vor der Exception");

        // Unchecked Exceptions - können, müssen aber nicht behandelt werden

        try {
            int[] arr = new int[10];
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Du bist zu weit gegangen - Amigo...");
        }

        //int[] arr = new int[-10]; // NegativeArraySizeException

        //int[] arr = null;
        //System.out.println(arr.length); // NullPointerException

        System.out.println("Das ist ein Text nach der Exception");

        System.out.println();

        // Checked Exceptions - Müssen behandelt werden, da sonst die Code nicht kompiliert

        try { // Kritische Code ausführen
            //FileOutputStream fos = new FileOutputStream("data.txt");
            FileInputStream fis = new FileInputStream("data.txt");
        }
        catch(FileNotFoundException e) { // Exception fangen, wenn sie geworfen wird
            //e.printStackTrace();
            System.out.println(e.getMessage()); // Standard Message - in englisch
            System.out.println("Datei ist nicht verfügbar!");
            System.out.println(e.getCause()); // Ursprünglicher Grund für die Exception
        }

        try {
            int i = check(17);
            System.out.println("Gefunden an Index: " + i);
        }
        catch(RuntimeException e) { // Fängt eine Exception
            System.out.println("Zahl wurde nicht gefunden!");
        }

        try {
            int i = checkNext(17);
            System.out.println("Gefunden an Index: " + i);
        }
        catch (Exception e) {
            System.out.println("Zahl wurde nicht gefunden!");
        }
    }

    /**
     * Sucht eine Zahl in einem Zahlen-Array
     * @param num Gesuchte Zahl
     * @return Index an dem die Zahl gefunden wurde
     */
    public int check(int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return i;
        }
        //return -1; // Wenn Exception geworfen wird ist ein return nicht möglich
        throw new RuntimeException("Zahl wurde nicht gefunden!"); // Wirft eine Exception
    }

    // bei throws muss sich der Verwender der Methode um die behandlung der Exception kümmern
    public int checkNext(int num) throws Exception { // Methode wird als potenziell gefährlich eingestuft
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return i;
        }
        throw new Exception("Zahl wurde nicht gefunden!");
    }
}
