package de.lubowiecki.javaplayground.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    private static List<String> namen = new ArrayList<>();

    public static void main(String[] args) {

        // void accept(T t); // Name der abstrakten Methode
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("Hallo Welt");

        Consumer<String> c2 = s -> {
            s = s.toUpperCase();
            if(!namen.contains(s)) {
                namen.add(s);
            }
        };

        c2.accept("peter");
        c2.accept("Bruce");
        c2.accept("Peter");

        System.out.println(namen);


        Consumer<String> cons1 = s -> System.out.printf("# %15s #\n", s);
        Consumer<String> cons2 = s -> System.out.printf("| %-15s |\n", s.substring(0, 2));
        Consumer<String> cons3 = s -> System.out.printf("<p>%s</p>", s);

        printValues(cons3, "Max", "Peter", "Anna", "Bob", "Hans");
    }

    public static void printValues(Consumer<String> consumer, String... values) {
        for (String v : values) {
            consumer.accept(v);
        }
    }
}
