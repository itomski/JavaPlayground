package de.lubowiecki.javaplayground.lambdas;

import java.util.ArrayList;
import java.util.List;

public class FuncInterfaceTest1 {

    public static void main(String[] args) {

        A a = () -> System.out.println(10 * 10 * 10);
        a.machWas();
        // System.out.println(a.toString());
        // System.out.println(a.hashCode());

        B b1 = (x, y) -> System.out.println(x + y);
        b1.doThat(2, 4);

        B b2 = (y, x) -> System.out.println(y * y * x);
        b2.doThat(10, 15);

        C c1 = (l) -> {
            StringBuilder sb = new StringBuilder();
            for(String s : l) {
                sb.append(s);
                sb.append(", ");
            }
            return sb.toString();
        };

        C c2 = (l) -> {
            StringBuilder sb = new StringBuilder();
            for(String s : l) {
                sb.append(">");
                sb.append(s);
                sb.append("\n");
            }
            return sb.toString();
        };

        String out = c1.print(List.of("Peter", "Bruce", "Anna", "Carol", "Berta"));
        System.out.println(out);

        // List of produziert eine Fixed Size List
        out = c2.print(List.of("Peter", "Bruce", "Anna", "Carol", "Berta"));
        System.out.println(out);

        C c3 = (l) -> {
            l.removeIf(s -> s.startsWith("A"));
            return c2.print(l);
        };

        List<String> list = new ArrayList<>(List.of("Peter", "Bruce", "Anna", "Carol", "Berta"));
        out = c3.print(list);
        System.out.println(out);

        D<String> d1 = (e, f) -> "###" + e + f + "###";
        System.out.println(d1.print("Anna", "Peter"));

        D<Double> d2 = (e, f) -> "###" + (e + f) + "###";
        System.out.println(d2.print(10.5, 17.2));

        E<Integer> add = (e, f) -> e + f;
        System.out.println(add.op(10, 17));

        E<Double> addD = (e, f) -> e + f;
        System.out.println(addD.op(10d, 17.22));


    }
}

interface A {
    void machWas();
}

interface B {
    void doThat(int a, int b);
}

interface C {
    String print(List<String> list);
}

interface D<T> {
    String print(T a, T b);
}

interface E<T> {
    T op(T a, T b);
}