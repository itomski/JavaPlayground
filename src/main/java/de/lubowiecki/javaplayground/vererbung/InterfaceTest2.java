package de.lubowiecki.javaplayground.vererbung;

public class InterfaceTest2 {

    public static void main(String[] args) {

        System.out.println(Machbar.ZAHL);

        AngelAusflug ausflug = new AngelAusflug();
        ausflug.machWas();
        ausflug.machWasAnderes();
        ausflug.machWasDefault();

    }
}

interface Machbar {

    // public static final
    int ZAHL = 100; // Eigenschaft ist in erbenden Klassen sichtbar

    // Interfaces haben KEINE Konstruktoren!

    void machWas();

    void machWasAnderes();

    static void machWasStatic() {
        System.out.println("Machbar: MachWasStatic");
    }

    // Können, müssen aber nicht in der erbenden Klasse implementiert werden
    // Werden sie nicht implementiert, wird der Standard aus dem Interface verwendet
    default void machWasDefault() {
        System.out.println("Machbar: MachWasDefault");
    }
}

interface NichtMachbar {

    void machWas();

    default void machWasDefault() {
        System.out.println("NichtMachbar: MachWasDefault");
    }
}

class AngelAusflug implements Machbar, NichtMachbar {

    @Override
    public void machWas() {
        //System.out.println(ZAHL); // Interfaces vererben statische Eigenschaften
        //machWasStatic(); // Interfaces vererben KEINE statischen Methoden
        //Machbar.machWasStatic(); // Über das Interface ist die Methode immer verfügbar
        System.out.println("AngelAusflug: MachWas");
    }

    @Override
    public void machWasAnderes() {
        // TODO: sinnvoll implementieren
        System.out.println("AngelAusflug: MachWasAnderes");
    }

    // Wird aus zwei Interfaces eine default-Methode mit gleicher Signatur bereitgestellt,
    // dann führt es zum Kompilererror
    // Lösung: Erbende Klasse verwendet keine der Default-Implementierungen, sondern stellt eine eigene bereit

    @Override
    public void machWasDefault() {
        System.out.println("AngelAusflug: MachWasDefault");
    }
}
