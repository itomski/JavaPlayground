package de.lubowiecki.javaplayground.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest3 {

    public static void main(String[] args) {

        List<Integer> zahlen = Arrays.asList(5,6,9,22,18,17,10);
        //zahlen.add(15);
        //zahlen.remove(4);
        zahlen.set(4, 25);

        for(int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();

        List<Integer> mutableList = new ArrayList<>(Arrays.asList(5,6,9,22,18,17,10));
        mutableList.add(15);
        mutableList.remove(4);

        System.out.println(mutableList);

        for(Integer i : mutableList) {
            if(i == 22) {
                //mutableList.remove(i); // Problem! ConcurrentModificationException
            }
            System.out.println(i);
        }

        System.out.println();

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");

        Object[] arr = strings.toArray(); // Ohne Parameter liefert es ein Object-Array
        System.out.println(Arrays.toString(arr));

        // Mit leeren Array als Parameter wird ein Array vom Parameter-Typ in passender Größe zurückgeliefert
        String[] strArr = strings.toArray(new String[]{}); // Nur Typ-Information ist interessant
        System.out.println(Arrays.toString(strArr));

        String[] strArr2 = new String[2];
        strings.toArray(strArr2);
        System.out.println(Arrays.toString(strArr2)); // [null, null]

        strArr2 = strings.toArray(strArr2); // Nur Typ-Information ist interessant
        System.out.println(Arrays.toString(strArr2)); // Hat passende Größe

        strArr2 = new String[10];
        strArr2 = strings.toArray(strArr2); // Ist das Array groß genug, dann wird es aufgefüllt
        // ist es zu klein, wird es durch ein neues in passender Größe ersetzt
        System.out.println(Arrays.toString(strArr2));

        short s = 10;
        s += 10; // s = (short)(s + 10);
        s++; // s = (short)(s + 1);
        //s = s + 1; // 1 ist int

        byte b1 = 10;
        byte b2 = 10;
        byte sum = (byte)(b1 + b2);

    }

}
