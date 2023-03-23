package de.lubowiecki.javaplayground.uebung2;

import java.util.Random;

public class DiceCup {

    private final DiceType type;

    private final Random rand = new Random();

    public DiceCup(DiceType type) {
        this.type = type;
    }

    public int roll() {
        return rand.nextInt(type.getEyes()) + 1;
    }

    public int[] roll(int num) {
        int[] rolls = new int[num];
        for(int i = 0; i < rolls.length; i++) {
            rolls[i] = roll();
        }
        return rolls;
    }
}
