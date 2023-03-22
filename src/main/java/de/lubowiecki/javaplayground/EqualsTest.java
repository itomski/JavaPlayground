package de.lubowiecki.javaplayground;

public class EqualsTest {

    public static void main(String[] args) {

        String s1 = "A"; // StringLiteralPool
        String s2 = "A";
        String s3 = new String("A"); // Landet nicht im Pool

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("--------------");

        int i = 130;
        int j = 130;
        System.out.println(i == j);


    }
}
