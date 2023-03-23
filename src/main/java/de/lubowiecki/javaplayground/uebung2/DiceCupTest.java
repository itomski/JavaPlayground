package de.lubowiecki.javaplayground.uebung2;

import java.util.Arrays;
import java.util.Scanner;

public class DiceCupTest {

    private final Scanner scanner = new Scanner(System.in);

    private static final String LABEL_1 = "Würfeltyp (W6, W10, W20, W100): ";
    private static final String LABEL_2 = "Anzahl Würfe: ";

    public static void main(String[] args) {
        new DiceCupTest().start();
    }

    private void start() {

        System.out.print(LABEL_1);
        String diceType = scanner.nextLine();

        // TODO: Exception abfangen
        DiceType type = DiceType.valueOf(diceType.toUpperCase());
        DiceCup cup = new DiceCup(type);

        while(true) {
            System.out.print(LABEL_2);
            String numStr = scanner.nextLine();

            if(numStr.equalsIgnoreCase("exit"))
                break;

            // TODO: Exception abfangen
            int num = Integer.parseInt(numStr);

            if (num == 1) {
                System.out.println(cup.roll());
            } else {
                System.out.println(Arrays.toString(cup.roll(num)));
            }
        }
    }
}
