package de.lubowiecki.javaplayground;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Period;
import java.util.Arrays;

public class ArgsTest {

    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        try {
            machWas();
            // Bei einer Exception in machWas() werden keine weitere Anweisungen danach ausgeführt
        }
        catch(IOException e) {

        }

        StringBuilder sb = new StringBuilder("Das ist ein Haus von ");
        String s = sb.append("Nikigraus").substring(5);
        System.out.println(sb);
        System.out.println(s);

        System.out.println(-10 % (-3));

        System.out.println("--------------");

        Period p = Period.of(2,5,10);
        System.out.println(p);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());


    }


    static void machWas() throws IOException {
        //throw new IOException();
        //try {
            FileInputStream fis = new FileInputStream("abc.txt");
        //}
        //catch (IOException e) {
        //  e.printStackTrace();
        //}



    }
}
