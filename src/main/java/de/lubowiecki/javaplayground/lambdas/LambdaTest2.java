package de.lubowiecki.javaplayground.lambdas;

import java.util.List;

public class LambdaTest2 {

    static int zahl = 10;

    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b + zahl;
        MathOperation sub = (a, b) -> a - b;

        int localInt = 15; // muss final oder effektiv final sein
        //sub = (a, b) -> a - b - localInt; // Error: localInt ist nicht effektiv final
        localInt = 20;

        MathOperation mod = (a, b) -> a % b;

        BetterMathOperation<Double> bMulti = (a, b) -> a * b;
        BetterMathOperation<Integer> bSub = (a, b) -> a - b;
        BetterMathOperation<Float> bDiv = (a, b) -> a / b;

        System.out.println(add.run(10, 25));
        System.out.println(sub.run(100, 25));

        List<Integer> zahlen = List.of(1,9,22,15,17,100,66,7,-2-18);
        System.out.println(runOperationOnList(zahlen, mod));

        // in JavaScript: machWas(10, function() { //...})

    }

    static int runOperationOnList(List<Integer> ints, MathOperation op) {
        int sum = 0;
        for(int i : ints) {
            sum = op.run(sum, i);
        }
        return sum;
    }
}

// FunctionalInterfaces: Interfaces mit nur einer abstrakten Methode

// SAM: Single Abstract Methode
@FunctionalInterface // Überprüft, ob die Voraussetzungen für ein FunctionalInterface erfüllt sind
interface MathOperation {

    int run(int a, int b); // Abstrakte Methode. Hat keinen Body

}

// T muss eine Kindklasse von Number sein
@FunctionalInterface
interface BetterMathOperation<T extends Number> {
    T run(T a, T b);
}
