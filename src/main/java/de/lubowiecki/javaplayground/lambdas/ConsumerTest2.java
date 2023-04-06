package de.lubowiecki.javaplayground.lambdas;

import java.util.function.Consumer;

public class ConsumerTest2 {

    public static void main(String[] args) {

        // void accept(T t);
        Consumer<String> consumer1 = s -> System.out.println(s.toLowerCase());
        Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());

        Consumer<String> consumer3 = consumer1.andThen(consumer2); // Verbindet 2 Consumer zu einem neuen

        consumer1.accept("Hallo");
        System.out.println();
        consumer2.accept("Hallo");
        System.out.println();
        consumer3.accept("Hallo");
    }
}
