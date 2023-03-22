package de.lubowiecki.javaplayground;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        int zufall = (int)(Math.random() * 6) + 1;

        Random rand = new Random();

        zufall = rand.nextInt(6) + 1;
        System.out.println(zufall);

        zufall = rand.nextInt(6) + 1;
        System.out.println(zufall);

        zufall = rand.nextInt(6) + 1;
        System.out.println(zufall);

        machWas(1000);
    }

    static void machWas(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Moin");
        }
    }
}
