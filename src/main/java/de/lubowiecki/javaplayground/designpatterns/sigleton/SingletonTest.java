package de.lubowiecki.javaplayground.designpatterns.sigleton;

public class SingletonTest {

    public static void main(String[] args) {

        // Singleton = es gibt immer nur 1 Objekt dieser Klasse!
        EagerSingleton es1 = EagerSingleton.getInstance();
        es1.setZahl(1234);

        EagerSingleton es2 = EagerSingleton.getInstance();
        System.out.println(es2.getZahl());

        machWas();

    }

    private static void machWas() {
        EagerSingleton es3 = EagerSingleton.getInstance();
        System.out.println(es3.getZahl());
    }
}
