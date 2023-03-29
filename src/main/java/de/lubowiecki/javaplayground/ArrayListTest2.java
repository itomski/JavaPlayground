package de.lubowiecki.javaplayground;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Hallo");
        String s = list1.get(0);

        // Nach dem Kompilieren sieht die Code etwa wie folgt aus

        List list2 = new ArrayList();
        list1.add((String) "Hallo");
        String s2 = (String) list1.get(0);
    }
}
