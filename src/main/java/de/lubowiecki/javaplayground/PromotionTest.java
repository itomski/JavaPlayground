package de.lubowiecki.javaplayground;

public class PromotionTest {

    public static void main(String[] args) {

        double d1 = 10; // int primitive widening zu double
        d1 = 10 + 10.0; // int primitive widening zu double, dann opration, erg = der größte typ

        byte b = 10;
        int sum = b + b; // erg ist ein int
        sum = b + 'B'; // char und byte werden in int konvertiert, erg ist ein int

        double sum2 = b + 'B' * d1; // char wird zu double, Punkt-Operation, byte wird zu double, Strich-Operation

        float f = 10.0f;
        sum2 = d1 + 'B' / f; // char wird zu float, Punkt-Operation, float wird zu double, Strich-Operation
    }
}
