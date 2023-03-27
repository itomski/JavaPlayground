package de.lubowiecki.javaplayground;

public class KonstruktorTest {

    private int zahl1;
    private int zahl2;
    private String name1;
    private String name2;

    // Verwendet ein Konstruktor einen anderen Konstruktor MUSS es die erste Anweisung darin sein

    public KonstruktorTest() { // #4
        this(0, "Leer"); // Ruft den anderen Konstruktor auf #3 auf
        System.out.println("#4");
    }

    public KonstruktorTest(int zahl, String name) { // #3
        this(zahl, name, name); // Ruft den anderen Konstruktor auf #2 auf
        System.out.println("#3");
    }

    public KonstruktorTest(int zahl, String name1, String name2) { // #2
        this(zahl, zahl, name1, name2); // Ruft den anderen Konstruktor #1 auf
        System.out.println("#2");
    }

    public KonstruktorTest(int zahl1, int zahl2, String name1, String name2) { // #1
        if(zahl1 <= 0) {
            System.out.println("Falsche Zahl");
            this.zahl1 = 1;
        }
        this.zahl2 = zahl2;
        this.name1 = name1;
        this.name2 = name2;
        System.out.println("#1");
    }

    public static void main(String[] args) {

        new KonstruktorTest(0, 2, "A", "B"); // #1

        System.out.println();

        new KonstruktorTest(0, "A", "B"); // #2

        System.out.println();

        new KonstruktorTest(0, "A"); // #3

        System.out.println();

        new KonstruktorTest(); // #4
    }
}