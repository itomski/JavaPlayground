package de.lubowiecki.javaplayground.bibliothek;

import java.util.Scanner;

public class App {
    private final Scanner scanner = new Scanner(System.in);

    private final BookService service = new BookService(scanner);

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {

        app: while(true) {

            System.out.print("Eingabe [IN|OUT|EXIT]: ");
            switch (scanner.nextLine().trim().toUpperCase()) {

                case "IN":
                    service.createBook();
                    break;

                case "OUT":
                    service.printAll(BookService.LONG, BookService.AUTOR);
                    break;

                case "EXIT":
                    break app;

                default:
                    System.out.println("Falsche Eingabe");
            }
        }

        System.out.println("Programm wurde beendet.");
    }
}
