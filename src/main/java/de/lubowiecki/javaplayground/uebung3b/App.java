package de.lubowiecki.javaplayground.uebung3b;

import java.util.Locale;
import java.util.Scanner;

public class App {

    // Schreibe ein Programm für eine Autoverwaltung
    // Es gibt PKWs und LKWs (mit passenden Eigenschaften)
    // Dafür wird Name des Kunden eingegeben und der Status des Fahrzeugs auf verliehen geändert

    private final VehicleRepository repo = new VehicleRepository();

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {

        String input = "";

        app: while(true) {
            System.out.print("Eingabe: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch(input) {
                case "n":
                    addVehicle();
                    break;

                case "l":
                    System.out.println(repo.print());
                    break;

                case "s":
                    search();
                    break;

                case "e": break app; // Schleife mit dem Label app wird abgebrochen

                default:
                    System.out.println("Ungültige Eingabe");
            }
        }

        System.out.println("Programmende");
    }

    private void addVehicle() {
        repo.add(new Vehicle("HH:AB123", "VW", "Polo"));
    }

    private void search() {
        System.out.print("Kennzeichen: ");
        String input = scanner.nextLine().trim().toUpperCase();
        Vehicle v = repo.findByRegistration(input);
        // TODO: Info, wenn Fahrzeug nicht gefunden
        v.setStatus(VehicleStatus.VERLIEHEN);
        // TODO: Info, dass Fahrzeug verliehen wurde
    }
}
