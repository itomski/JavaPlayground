package de.lubowiecki.javaplayground.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {

    public static void main(String[] args) {

        //List<Integer> ints = List.of(10,17,22,1,19,18,5);

        Set<Integer> ints = Set.of(10,17,22,1,19,18,5);

        Iterator<Integer> itr = ints.iterator();
        while(itr.hasNext())
            System.out.println(itr.next()); // Verschiebt den Cursor auf das nächste Element und liefert es
    }
}
