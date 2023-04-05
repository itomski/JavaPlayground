package de.lubowiecki.javaplayground.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTest {

    private static final Queue<Integer> warteschlange = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.print("Zahl" + (i) + ": ");
            warteschlange.offer(scanner.nextInt());
        }

        System.out.println();

        while(warteschlange.size() > 0) {
            System.out.println("Anzahl Elemente in Warteschlange: " + warteschlange.size());
            System.out.println("Enternt: " + warteschlange.poll());
        }
    }
}
