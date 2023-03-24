package de.lubowiecki.javaplayground;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Eingabe: ");
            selectOption(scanner.nextLine());
        }
    }

    private static void selectOption(String selection) {

        /*
        if(selection.equals("exit")) System.exit(0);
        else if(selection.equals("in")) System.out.println("Eingabe");
        else System.out.println("Falsche Eingabe");
        */

        /*
        if(selection.equals("exit")) {
            System.exit(0);
        }
        else if(selection.equals("in")) {
            System.out.println("Eingabe");
        }
        else if(selection.equals("out")) {
            System.out.println("Ausgabe");
        }
        else {
            System.out.println("Falsche Eingabe");
        }
        */

        // Alternative
        // trim entfernt leerzeichen am Anfang und Ende der Zeichenkette
        switch(selection.trim().toLowerCase()) {

            case "exit":
                System.exit(0); // Beendet das Programm

            case "in":
                System.out.println("Deine Eingabe");
                break;

            case "out":
                System.out.println("Ausgabe...");
                break;

            default:
                System.out.println("Falsche Eingabe...");
        }

    }
}
