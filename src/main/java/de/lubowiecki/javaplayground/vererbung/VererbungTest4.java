package de.lubowiecki.javaplayground.vererbung;

public class VererbungTest4 {

    public static void main(String[] args) {

        Mensch m = new Student();
        System.out.println(m.i);
        m.machWas();
        m.machWasStatic();
        Mensch.machWasStatic();

        System.out.println();

        Student s = new Student();
        System.out.println(s.i);
        s.machWas();
        s.machWasStatic();
        Student.machWasStatic();

        System.out.println();

        System.out.println(Integer.parseInt("10"));
        //System.out.println(Integer.parseInt("0b10"));
        System.out.println(Integer.parseInt("011"));
        Integer i = 011;
        System.out.println(i);

    }
}

class Mensch {

    int i = 10;

    void machWas() {
        System.out.println("Mensch: " + i);
    }

    static void machWasStatic() {
        System.out.println("Mensch-Static");
    }

}

class Student extends Mensch {

    int i = 20;

    void machWas() {
        System.out.println("Student: " + i);
    }

    static void machWasStatic() {
        System.out.println("Student-Static");
    }

}
