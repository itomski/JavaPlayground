package de.lubowiecki.javaplayground.collections;

import de.lubowiecki.javaplayground.io.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> namen = new HashSet<>(List.of("Carol", "Natasha", "Tony", "Bruce", "Peter", "Carol"));
        namen.add("peter");
        System.out.println(namen);

        for (String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        Person p1 = new Person("Peter", "Parker", LocalDate.of(2010, 1,5));
        Person p2 = new Person("Peter", "Parker", LocalDate.of(2010, 1,5));

        Set<Person> personen = new HashSet<>();
        personen.add(p1);
        personen.add(p2);
        System.out.println(personen);

        System.out.println();

        BuggyPerson bp1 = new BuggyPerson("Peter", "Parker", LocalDate.of(2010, 1,5));
        System.out.println(bp1.hashCode());
        BuggyPerson bp2 = new BuggyPerson("Peter", "Parker", LocalDate.of(2010, 1,5));
        System.out.println(bp2.hashCode());

        Set<BuggyPerson> personen2 = new HashSet<>();
        personen2.add(bp1);
        personen2.add(bp2);
        System.out.println(personen2);

        System.out.println();

        Set<String> namen2 = new TreeSet<>(List.of("Carol", "Natasha", "Tony", "Bruce", "Peter", "Carol"));
        System.out.println(namen2);

        // compareTo liefert negativ, 0 oder positiv als int-Wert
        //System.out.println("Carol".compareTo("carol"));

        Set<Integer> zahlen = new TreeSet<>((a,b) -> b - a);
        zahlen.addAll(List.of(22,17,1,18,132,1097,1,19,88));
        System.out.println(zahlen);

        System.out.println();

        p1 = new Person("Peter", "Parker", LocalDate.of(2010, 1,5));
        p2 = new Person("Bruce", "Banner", LocalDate.of(2000, 5,1));
        Person p3 = new Person("Carol", "Danvers", LocalDate.of(1999, 7,18));

        Set<Person> personen3 = new TreeSet<>();
        personen3.add(p1);
        personen3.add(p2);
        personen3.add(p3);

        System.out.println(personen3);
    }
}
