package de.lubowiecki.javaplayground;

import java.util.Arrays;

public class ArrTest4 {

    public static void main(String[] args) {

        MachBarX mbx = () -> "ABC";
        System.out.println(mbx.toString());
    }
}

interface MachBarX {

    String machWas();

    String toString(); // Neutral
}

interface AA {

    default String machWas() {
        return "0000";
    }
}

interface BB extends AA {

    String machWas(); // Überschreibt das default, muss in Kindklassen wieder implementiert werden
}

abstract class CC implements AA {

    public abstract String machWas(); // Überschreibt das default
}

class DD extends CC {

    @Override
    public String machWas() {
        return null;
    }
}