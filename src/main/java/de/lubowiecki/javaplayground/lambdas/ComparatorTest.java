package de.lubowiecki.javaplayground.lambdas;

import de.lubowiecki.javaplayground.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        // int compare(Person a, Person b)
        // "Peter".compareTo("Bruce")

        // Lambda ist die Implementierung einer abstrakten Methode aus einem Interface
        // Es wird die einzige abstrakte Mehode implementiert

        // Vorname
        Comparator<Person> c1 = (x, y) -> x.getFirstname().compareTo(y.getFirstname());
        // Nachname
        Comparator<Person> c2 = (a, b) -> {
            return a.getLastname().compareTo(b.getLastname());
        };
        // Geburtsdatum
        Comparator<Person> c3 = (a, b) -> a.getBirthDate().compareTo(b.getBirthDate());
        /*
        public int compare(Person a, Person b) {
            return a.getBirthDate().compareTo(b.getBirthDate());
        }
        */

        Person p1 = new Person("Peter", "Parker", LocalDate.of(1998, 10, 25));
        Person p2 = new Person("Bruce", "Banner", LocalDate.of(1989, 5, 1));
        Person p3 = new Person("Carol", "Danvers", LocalDate.of(2001, 8, 15));
        Person p4 = new Person("Carol", "Anders", LocalDate.of(1980, 1, 1));

        Comparator<Person> comp1 = new PersonComp();
        int i = comp1.compare(p1, p2);
        System.out.println(i);

        System.out.println();

        List<Person> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);
        personen.add(p3);
        personen.add(p4);

        // Nicht sortiert
        for(Person p : personen) {
            System.out.println(p.getFirstname());
        }

        System.out.println();
        //personen.sort(c1); // Verwendet den Comparator
        //personen.sort(c3.reversed()); // Umgekehrt
        personen.sort(c1.thenComparing(c2)); // Vergleicht erstmal nach c1 und dann nach c2

        // sortiert
        for(Person p : personen) {
            System.out.println(p.getFirstname() + ", " + p.getLastname());
        }
    }
}

class PersonComp implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        //System.out.println(a.getFirstname() + " wird mit " + b.getFirstname() + " vergliechen");
        return a.getBirthDate().compareTo(b.getBirthDate());
    }
}
