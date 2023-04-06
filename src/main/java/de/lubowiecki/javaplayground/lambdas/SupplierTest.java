package de.lubowiecki.javaplayground.lambdas;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class SupplierTest {

    private static final IntSupplier W6;
    private static final IntSupplier W10;
    private static final IntSupplier W20;
    private static final IntSupplier W100;
    private static final IntSupplier STUPID;

    static {
        Random rand = new Random();
        W6 = () -> rand.nextInt(6) + 1;
        W10 = () -> rand.nextInt(10) + 1;
        W20 = () -> rand.nextInt(20) + 1;
        W100 = () -> rand.nextInt(100) + 1;
        STUPID = () -> LocalTime.now().getNano();
    }


    public static void main(String[] args) {

        Random rand = new Random();

        //int[] rolls = rollDice(STUPID, 100);
        //System.out.println(Arrays.toString(rolls));

        // Stream
        IntStream.generate(() -> rand.nextInt(6) + 1) // IntSupplier
                .limit(1_000_000)
                .filter(d -> d > 2) // IntPredicate
                .forEach(d -> System.out.println(d)); // IntConsumer

    }

    private static int[] rollDice(IntSupplier dice, int num) {
        int[] rolls = new int[num];
        for(int i = 0; i < num; i++) {
            rolls[i] = dice.getAsInt();
        }
        return rolls;
    }
}
