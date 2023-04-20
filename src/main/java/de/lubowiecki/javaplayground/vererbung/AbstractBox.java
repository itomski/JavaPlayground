package de.lubowiecki.javaplayground.vererbung;

public abstract class AbstractBox {

    // finale Instanzvariablen MÜSSEN spätestens im Konstruktor zugeweisen werden
    protected final String CONTENT;

    // Abstrakte Klassen können konkrete und abstrakte Methoden enthalten
    // Ist eine methode abstrakt, MUSS die Klasse abstrakt sein

    // Obwohl abstrakte Klassen nicht direkt instanziert werden können,
    // können sie Konstruktoren enthalten
    // Konstruktoren können von erbenden Klassen verwendet werden

    AbstractBox(String c) {
        CONTENT = c;
    }

    void machWas() {
        System.out.println("AbstractBox: machWas");
    }

    abstract void machWasAnderes();
}

class KonkreteKlasse1 extends AbstractBox {

    // Konkrete Klassen die von abstrakten Klassen erben MÜSSEN alle abstrakten Methoden implementieren,
    // oder selbst abstrakt werden

    KonkreteKlasse1() {
        super("K1");
    }

    @Override
    void machWasAnderes() {
        System.out.println(CONTENT);
    }
}

class KonkreteKlasse2 extends AbstractBox {

    KonkreteKlasse2() {
        super("K2");
    }

    @Override
    void machWasAnderes() {
        System.out.println(CONTENT + "...");
    }
}
