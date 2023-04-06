package de.lubowiecki.javaplayground.lambdas;

import de.lubowiecki.javaplayground.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(1998, 10, 25)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1989, 5, 1)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(2001, 8, 15)));
        personen.add(new Person("Carol", "Anders", LocalDate.of(1980, 1, 1)));

        // Consumer<T>: void accept(T t);
        personen.forEach(p -> System.out.println(p.getFirstname() + " " + p.getLastname()));

        System.out.println();

        // Predicate<T>: boolean test(T t);
        personen.removeIf(p -> p.getFirstname().startsWith("B"));
        personen.forEach(p -> System.out.println(p.getFirstname() + " " + p.getLastname()));

        Random rand = new Random();

        System.out.println();
        List<Integer> zahlen = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            zahlen.add(rand.nextInt(10) + 1);
        }

        System.out.println(zahlen);

        System.out.println();

        zahlen.removeIf(i -> i > 7); // boolean test(Integer i);
        System.out.println(zahlen);

        System.out.println();

        // Supplier<T>: T get();
        Supplier<Integer> W6 = () -> rand.nextInt(6) + 1;
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
    }
}
