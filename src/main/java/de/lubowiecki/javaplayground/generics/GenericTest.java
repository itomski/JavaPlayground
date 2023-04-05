package de.lubowiecki.javaplayground.generics;

public class GenericTest {

    public static void main(String[] args) {

        // Wenn kein Generischer-Typ bei einer Generischen-Klasse angegeben wird,
        // wird der RAW-Type (hier Object) verwendet
        GenericBox gb1 = new GenericBox();
        gb1.setValue("Hallo");
        System.out.println(gb1.getValue());

        GenericBox<String> gb2 = new GenericBox<>();
        gb2.setValue("Moin Moin!");
        System.out.println(gb2.getValue());

        GenericBox<Integer> gb3 = new GenericBox<>();
        gb3.setValue(100);
        System.out.println(gb3.getValue());
    }
}
