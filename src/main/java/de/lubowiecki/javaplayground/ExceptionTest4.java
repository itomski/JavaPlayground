package de.lubowiecki.javaplayground;

import java.time.LocalDate;

public class ExceptionTest4 {

    public static void main(String[] args) {
        System.out.println("MAIN Start");
        new ExceptionTest4().start();
        System.out.println("MAIN Ende");

        boolean erg = true | false;

        int y = 5;
        boolean z = true;

        if(true ||--y == 4)
            System.out.println(y);
        else {}

        StringBuilder sb = new StringBuilder();
        sb.equals(sb);

        System.out.println(LocalDate.of(2010,10,10).lengthOfMonth());
        System.out.println(LocalDate.of(2010,10,10).getDayOfMonth());
        System.out.println(LocalDate.of(2010,10,10).getDayOfYear());
        System.out.println(LocalDate.of(2010,10,10).getDayOfWeek());

        for(int i : new int[]{1,2,3,4,5,6,7,8}) {
            System.out.println(i);
        }


    }

    private void start() {
        System.out.println("start Start");
        next();
        System.out.println("start Ende");
    }

    private void next() {
        System.out.println("next Start");
        try {
            last();
        }
        catch (RuntimeException e) {
            System.out.println("next gefangen");
        }
        System.out.println("next Ende");
    }

    private void last() {
        System.out.println("last Start");
        throw new RuntimeException(); // Methode wird sofort verlassen, Exception wird an Aufrufer weiergegeben
        //System.out.println("last Ende"); // Ist nicht mehr ausführbar
    }
}
