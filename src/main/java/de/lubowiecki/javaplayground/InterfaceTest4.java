package de.lubowiecki.javaplayground;

public class InterfaceTest4 {

    public static void main(String[] args) {

        System.out.println(I.x);
        I.machWasStatic();
        System.out.println(ConcretI.x);
        // ConcretI.machWasStatic();

        ConcretI i = new ConcretI();
        i.machWas();
        System.out.println(i.x);
        // i.machWasStatic();

        I j = new ConcretI();
        j.machWas();
        System.out.println(j.x);
        //j.machWasStatic(); // Über das Objekt nicht verfügbar
        I.machWasStatic(); // Muss über das Interface verwendet werden

    }
}

interface I {
    int x = 10; // public static final, wird vererbt

    default void machWas() { // wird vererbt
        System.out.println("machWas()");
    }

    static void machWasStatic() { // wird nicht vererbt
        System.out.println("machWasStatic()");
    }
}

class ConcretI implements I {

}