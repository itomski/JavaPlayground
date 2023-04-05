package de.lubowiecki.javaplayground.collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {

    public static void main(String[] args) {

        Deque<Integer> zahlen = new LinkedList<>();
        zahlen.offer(10);
        zahlen.offer(20);
        zahlen.offer(30);

        // add und offer: Elemente werden hinzugefügt
        System.out.println(zahlen);
        zahlen.offerFirst(100);
        zahlen.offerLast(200);
        System.out.println(zahlen);

        // remove und poll: Elemente werden entfernt
        System.out.println(zahlen.pollFirst());
        System.out.println(zahlen.pollLast());
        System.out.println(zahlen);

        // element und peek: Elemente werden nicht entfernt
        System.out.println(zahlen.peekFirst());
        System.out.println(zahlen.peekLast());
        System.out.println(zahlen);

        System.out.println();

        // Stack
        zahlen = new LinkedList<>();
        zahlen.push(1);
        zahlen.push(17);
        zahlen.push(5);
        zahlen.push(9);
        System.out.println(zahlen);

        while(zahlen.size() > 0)
            System.out.println(zahlen.pop());
    }
}
