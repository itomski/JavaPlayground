package de.lubowiecki.javaplayground.fahrzeugverwaltung;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("Ford", "Ka", "HH:AB 123");

        Person p = new Person("Peter", "Parker", 25);
        f1.setFahrer(p);

        f1.beschleunigen(100);
        System.out.println(f1);

        f1.starteMotor();
        f1.beschleunigen(100);
        System.out.println(f1);

        f1.abbremsen(50);
        System.out.println(f1);

        f1.abbremsen(70);
        System.out.println(f1);

        f1.stopMotor();

    }

}
