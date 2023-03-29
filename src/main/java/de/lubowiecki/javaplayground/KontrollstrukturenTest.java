package de.lubowiecki.javaplayground;

public class KontrollstrukturenTest {

    static int y; // bekommt einen defaultwert

    public static void main(String[] args) {

        int i = 15;
        int j = 15;

        System.out.println((i < j) ? "kleiner" : "gleich oder größer");

        String s;
        int x = 10;
        if(i < j) {
            s = "kleiner";
            x = 0;
        }
        else if(i > j){
            s = "größer";
        }
        else {
            s = "gleich";
        }

        System.out.println(x);
        System.out.println(y);

        s = (i < j) ? "kleiner" : (i > j) ? "größer" : "gleich";
        System.out.println(s);

        System.out.println("Das ist " + ((i < j) ? "kleiner" : "gleich oder größer"));
    }
}
