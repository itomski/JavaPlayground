package de.lubowiecki.javaplayground.vererbung.b;

import de.lubowiecki.javaplayground.vererbung.a.Parent;

import java.util.Map;

public class Child extends Parent {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.x); // mit Vererbung (über ein erbendes Objekt) ist x auch außerhalb des Paketes sichtbar

        Parent p = new Parent();
        //System.out.println(p.x); // x ist ohne Vererbung nur im Paket a sichtbar

        A.SubA sub = new A().new SubA();

        A a = new A();
        A.SubA sub2 = a.new SubA();

        B.SubB sub3 = new B.SubB();

    }
}

class A {

    // Für ein Objekt von SubA wird immer ein Objekt von A benötigt
    class SubA {

    }
}

class B {

    // Interessant, wenn Innere-Klasse ohne ein Objekt der Äußeren-Klasse nutzbar sein soll
    static class SubB {

    }
}
