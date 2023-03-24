package de.lubowiecki.javaplayground;

import java.time.LocalDate;
import java.util.Arrays;

public class PersonalVerwaltung {

    private final Person[] personen;

    public PersonalVerwaltung() {
        personen = new Person[]{
                new Person("Peter", "Parker", LocalDate.of(1999, 5, 15)),
                new Person("Bruce", "Banner", LocalDate.of(1980, 1, 23)),
                new Person("Carol", "Danvers", LocalDate.of(1995, 10, 7)),
                new Person("Natasha", "Romanov", LocalDate.of(2002, 7, 1)),
                null, null, null, null, null, null
        };
    }

    public static void main(String[] args) {
        new PersonalVerwaltung().start();
    }

    private void start() {
        /*
        for(int i = 0; i < personen.length; i++) {
            System.out.println(personen[i].getFirstname() + " " + personen[i].getLastname() + ", " + personen[i].getFormattedBirthDate());
        }
        */

        /*
        for(int i = 0; i < personen.length; i++) {
            Person p = personen[i];
            System.out.println(p.getFirstname() + " " + p.getLastname() + ", " + p.getFormattedBirthDate());
        }
        */

        Person p1 = new Person("Max", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Hans", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Anna", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Berta", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Achim", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Klaus", "Mustermann", LocalDate.now());
        addPerson(p1);

        p1 = new Person("Benjamin", "Mustermann", LocalDate.now());
        addPerson(p1);

        for(Person p : personen) {
            if(p == null) {
                System.out.println("Leer");
            }
            else {
                System.out.println(p.getFirstname() + " " + p.getLastname() + ", " + p.getFormattedBirthDate());
            }
        }

        // Streams und Lambdas
        //Arrays.stream(personen).forEach(p -> System.out.println(p.getFirstname() + " " + p.getLastname() + ", " + p.getFormattedBirthDate()));
    }

    private int getNextFree() {
        for(int i = 0; i < personen.length; i++) {
           if(personen[i] == null)
               return i;
        }
        return -1;
    }

    private void addPerson(Person person) {
        int i = getNextFree();
        if(i < 0) {
            System.out.println("Kein Hinzufügen möglich. Alles belegt.");
        }
        else {
            personen[i] = person;
        }
    }
}
