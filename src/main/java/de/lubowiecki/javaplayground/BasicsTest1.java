package de.lubowiecki.javaplayground;

public class BasicsTest1 {

    static String s1; // default null
    static Integer i1; // default null

    public static void main(String[] args) {

        String s2 = null;
        Integer i2 = null;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(i1);
        System.out.println(i2);

        s2 = s2 + "wir"; // "nullwir"
        System.out.println(s2);

        System.out.println(i2 + 5);
    }
}
