package de.lubowiecki.javaplayground;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        int[][][] arr = new int[5][5][5];

        /*
        arr[0] = new int[5][3];
        arr[1] = new int[2][7];
        arr[2] = new int[4][9];
        arr[3] = new int[100][15];
        arr[4] = new int[1][2];
        */

        for(int[][] sub : arr) {
            for(int[] subSub : sub) {
                System.out.println(Arrays.toString(subSub));
            }
            System.out.println();
        }

        long[][] arrLong = new long[3][3];

        /*
        {
            {0,1,2},
            {0,1,2},
            {0,1,2}
        }
        */

        arrLong[0] = new long[3];
        arrLong[0][0] = 3;

        /*
        try {
            System.out.println("...");
            createException();
        }
        catch(IOException e) {
        }
        */
    }

    public static IOException createException() {
        return new IOException();
        //throw new IOException(); // Handle or Declare
    }
}
