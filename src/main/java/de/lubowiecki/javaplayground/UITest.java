package de.lubowiecki.javaplayground;

import java.util.Scanner;

public class UITest {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new UITest().start();
    }

    private void start() {

        while(true) { // Endlosschleife
            System.out.print("Eingabe: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit"))
                break;

            System.out.println("Deine Eingabe: " + input);
        }
    }
}
