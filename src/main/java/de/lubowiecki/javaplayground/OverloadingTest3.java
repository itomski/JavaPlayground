package de.lubowiecki.javaplayground;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class OverloadingTest3 {

    public static void main(String[] args) {

        Parent p = new Child("A");
        p.machWas();
        //p.machWas(true); // über Parent-Refenz nicht sichtbar


        int[] i = new int[][]{{1,2},{2,3},{4,5}}[1]; // {2,3}


        // Predicate<T>
        //boolean test(T t);

        // Predicate<List>
        //boolean test(List t); // Überschreiben
        //boolean test(ArrayList t); // Überladen

        // Predicate<ArrayList>
        //boolean test(ArrayList t); // Überschreiben
        //boolean test(List t); // Überladen

        System.out.println();

        /*
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
        System.out.println(q.add(1));
        System.out.println(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
        System.out.println(q.add(5));
        //System.out.println(q.add(6));
        System.out.println(q.offer(6));
        */

        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println("#" + sb + "#");
        System.out.println("#" + sb.substring(5) + "#");
        System.out.println("#" + sb.charAt(5) + "#");

        System.out.println("Hallo Welt".indexOf('W'));
        //System.out.println("Hallo Welt".substring(1, -1)); // Problem

        Parent p3 = new Parent();
        Parent p4 = new Parent();
        p3.equals(p4);

        StringBuilder sb1 = new StringBuilder(); // capacity 16, size 0
        sb1 = new StringBuilder("ABCD"); // capacity 4 + 16 = 20, size 4
        sb1 = new StringBuilder(100); // capacity 100, size 0
        sb1 = new StringBuilder(0); // capacity 0
        sb1.append("A"); // 0 * 2 + 2 = 2
        sb1.trimToSize(); // capacity 1, size 1
        sb1.ensureCapacity(200); // Verändert nur die Capacity
        sb1.setLength(200); // Verändert Capacity und Länge

        Object[] arr = new String[10];

        A a[] = new A[]{new B(), new C()}; // {B, C}

        a = new A[3]; // {null, null, null}
        a[1] = new B(); // {null, B, null}
        a = new B[4]; // {null, null, null, null}
        //a = new B()[10];
        //a = new A()[10];

        System.out.println();

        String[] arr1 = new String[3];
        Object[] arr2 = arr1;
        arr2[0] = 123; // Integer widening zu Object: Dahinter steht ein StringArray -> ArrayStoreException!

        boolean b = false;
        if(b = true) {
        }

        //if(true = b) {
        //}

        //String s = "...";
        //if((s += "Moin").length() > 10) {
        //}

        Long l = 100l;
        Byte by = 100;
        Float f = (float)by + l.intValue(); // 1. Boxing 2. Widening. Unboxing und Narrowing geht nicht
        boolean x = !(l > 100);

        var z = 100;
        //z = 100l;

        int a5 = 16; // 00010000
        int a6 = 23; // 00010111
        // a5 &= a6; // 00010000

        int array1[][] = new int[2][0]; // {{},{}}
        int array2[][] = new int[2][]; // {null,null}
        array2[0] = new int[]{1,2,3}; // {{1,2,3},null}
        array2[0][0] = 5; // {{5,2,3},null}

        // 5, 7, 8, 25
        //15 // -4 (3 als minus + -1)
        //3 // -1 (0 als minus + -1)

        //System.out.println(new Integer(1) == new Double(10.0));
    }
}

interface A {
}

class B implements A {
}

class C implements A {
}

class Parent {

    Parent(String a) {
    }

    Parent() {
    }

    public void machWas() {
        System.out.println(this.getClass().getSimpleName());
    }
}

class Child extends Parent {

    Child(String s) {
        super(s);
    }

    @Override
    public void machWas() {
        System.out.println(this.getClass().getSimpleName());
    }

    public void machWas(boolean b) {
        System.out.println(this.getClass().getSimpleName() + ": " + b);
    }
}
