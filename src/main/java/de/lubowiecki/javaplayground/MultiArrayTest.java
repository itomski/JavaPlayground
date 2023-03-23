package de.lubowiecki.javaplayground;

import java.util.Arrays;

public class MultiArrayTest {

    public static void main(String[] args) {

        char[] arr = new char[20]; // Eindimenionales Array
        Arrays.fill(arr, 'X'); // füllt das Array mit vorgegebenen Werten
        System.out.println(Arrays.toString(arr));

        System.out.println(); // Leerzeile

        char[][] arr2D = new char[10][];

        Arrays.fill(arr2D, new char[] {'A','B','C'});

        for(char[] c : arr2D) { // c ist eine Referenz auf die Array der ersten Dimension
            Arrays.fill(c, 'x');
            System.out.println(Arrays.toString(c));
        }

        System.out.println();

        for(char[] c : arr2D) {
            for(char subC : c) {
                System.out.print(subC + " ");
            }
            System.out.println();
        }


        System.out.println();

        for(int i = 0; i < arr2D.length; i++) { // Zeilen, 1d
            for(int j = 0; j < arr2D[i].length; j++) { // Spalte, 2d
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(arr2D[9][0]);

        /*  i    j
        {
            0: {
                0: x
                1: x
                2: x
                etc...
            }
            1: {
                0: x
                1: x
                etc...
            }
            2: {}
            3: {}
            etc...
        }
        */

        // new int[3][];
        int[][] arr3 = {{1,2,3}, {1,2}, {1,2,3,4,5}};

        String str = ">>>R>>>>";
        String[] zeichen = str.toLowerCase().split(""); // wird Zeichenweise in ein Array zerlegt
        System.out.println(Arrays.toString(zeichen));

        for(String s: zeichen) {
            if(s.equals(">"))
                System.out.println("vor ");
        }
    }
}
