package de.lubowiecki.javaplayground;

public class SwitchTest2 {

    public static void main(String[] args) {

        String input = "MO";

        // String
        switch(input) {
            case "MO": System.out.println("Montag");

            case "mo": System.out.println("montag"); // Ist Case-Sensitiv

            case "DI": System.out.println("Dienstag");

            case "MI": System.out.println("Mittwoch");

            case "DO": System.out.println("Donnerstag");

            case "FR": System.out.println("Freitag");

            case "SA": System.out.println("Samstag");

            case "SO": System.out.println("Sonntag");

            default: System.out.println("Nicht gültig!");
        }

        System.out.println();

        byte input2 = 127;

        // byte, short, int, char
        switch(input2) {
            case 1: System.out.println("Montag");

            case 2: System.out.println("Dienstag");

            case 7: System.out.println("Mittwoch");

            case 4: System.out.println("Donnerstag");

            case 6: System.out.println("Freitag");

            case 5: System.out.println("Samstag");

            case 3: System.out.println("Sonntag");

            default: System.out.println("Nicht gültig!");
        }

        System.out.println();

        // Enum
        Wochentag tag = Wochentag.valueOf("DO");

        switch(tag) {
            case MO: System.out.println("Montag");

            case DI: System.out.println("Dienstag");

            case MI: System.out.println("Mittwoch");

            case DO: System.out.println("Donnerstag");

            case FR: System.out.println("Freitag");

            case SA: System.out.println("Samstag");

            case SO: System.out.println("Sonntag");
        }

        int zahl = 10;
        final int a = 10;
        final int b = 20;
        final int c; // Runtime-Konstante, im switch nicht erlaubt!
        c = 30;

        // Im switch können Compile-Time-Konstanten verwendet werden

        switch(zahl) {
            case a:
            case b: System.out.println("Dienstag");
                break;

            // case c: System.out.println("Mittwoch"); // Error, c ist keine Compiletime-Konstante

            default: System.out.println("Ungültige eingabe!");
        }

        System.out.println(Color.BLUE.getCode());
    }
}

enum Wochentag {
    MO, DI, MI, DO, FR, SA, SO;

    Wochentag() {
        System.out.println(this);
    }
}

enum Color {
    WHITE("#ffffff"), BLACK("#000000"), RED("#ff0000"), GREEN("#00ff00"), BLUE("#0000ff");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
