package de.lubowiecki.javaplayground.lambdas;

import java.util.function.Predicate;

public class LambdaTest3 {

    public static void main(String[] args) {

        // Für Lambdas wird immer ein Interface benötigt (FunctionalInterface)
        // Lambdas sind Implementierungen der einzigen abstrakten Methode des FunctionalInterface
        // Jedes FunctionalInterface ist ein SAM (Single Abstract Method)

        // Ein Lambda muss aus dem Interface eindeutig ermitteln können, welche Methode realisiert werden muss
        // Es darf nur eine einzige sein!!!!!

        // Als anonyme Klasse: Kann auf einem Interface, abstrakten Klasse oder einer konkreten Klasse basieren
        // kann beliebige Anzahl von Methoden implementieren
        // Es wird dynamisch eine Klasse ohne Namen gebaut, die von Fahrbar abgleitet ist und sofort eine Instanz davon gebaut
        Fahrbar f1 = new Fahrbar() {
            @Override
            public void doSomething() {
                System.out.println("Fährt nach Hamburg");
            }

            @Override
            public void machWasAnderes() {
                System.out.println("Macht was ganz anderes...");
            }
        };

        // Lambda Realisiert: void doSomething();
        Fahrbar f2 = () -> System.out.println("Fährt nach Kiel");

        f1.doSomething();
        f2.doSomething();

        System.out.println();

        fahre(f1);
        fahre(f2);
        fahre(() -> System.out.println("Fahre nach München")); // Ein Lambda ist eine Implementierung und sofortige Instanzierung

    }

    private static void fahre(Fahrbar f) {
        f.doSomething();
    }
}

@FunctionalInterface
interface Fahrbar {

    void doSomething();

    //void beladen();

    // Ein SAM darf statische Methoden enthalten, sind bereits implementiert
    static void machWas() {
        System.out.println("Mach was");
    }

    // ist bereits implementiert
    default void machWasAnderes() {
        System.out.println("Mach was anderes");
    }

    // Alle Methoden von Objekt sind bereits implementiert und werden für das SAM nicht berücksichtigt
    // toString, equals, hashCode, wait, notify, notifyAll
    String toString();
}