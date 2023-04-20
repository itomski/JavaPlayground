package de.lubowiecki.javaplayground.vererbung;

import java.util.Arrays;

public class Test {

    int x = 10;
    int y = x;

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,}; // Nur bei gleichzeitiger Deklaration und Initialisierung
        //arr = {1,2,3,4,}; // Error
        arr = new int[]{1,2,3,4,}; // Ok

        int[][] nums = new int[3][3]; // {{0,0,0},{0,0,0},{0,0,0}}
        nums[0] = new int[2]; // {{0,0},{0,0,0},{0,0,0}}
        nums[2] = new int[5]; // {{0,0},{0,0,0},{0,0,0,0,0}}
        nums[1] = new int[]{1,2,3}; // {{0,0},{1,2,3},{0,0,0,0,0}}

        print(nums[1]);
        System.out.println();
        print(new int[]{17,19,22,15,7});

        int arr2[][] = new int[3][]; // {null, null, null}
        Arrays.sort(arr2);
        arr2[0] = new int[]{7,9,22,18}; // {{7,9,22,18}, null, null}
        Arrays.sort(arr2[0]);


    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
