package de.lubowiecki.javaplayground.vererbung;

public class VererbungsReihenfolge {

    public static void main(String[] args) {

        KonkreteAbc abc = new KonkreteAbc();
        abc.machWas();
    }

}

interface Abc {

    default void machWas() {
        System.out.println("Abc");
    }
}

abstract class AbstractAbc {

    public void machWas() {
        System.out.println("AbstractAbc");
    }
}

// Bei einer Vererbung sind Klassen höherwertiger als Interfaces
class KonkreteAbc extends AbstractAbc implements Abc {

    public void machWas() {
        System.out.println("AbstractAbc");
    }
}
