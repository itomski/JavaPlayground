package de.lubowiecki.javaplayground;

public class OperatorTest {

    public static void main(String[] args) {

        int sum = 100 + 20 * 5;

        boolean a = true;
        boolean b = false;

        // Bit-Operatoren
        System.out.println(a & b); // AND: true, wenn a und b true sind, ansonsten false
        System.out.println(a | b); // OR: true, wenn a oder b oder beides true ist
        System.out.println(a ^ b); // XOR: true, wenn entweder a oder b true sind. Ist beides true, gibts false

        System.out.println();

        // Logische-Operatoren
        System.out.println(a && b); // AND: true, wenn a und b true sind, ansonsten false
        System.out.println(a || b); // OR: true, wenn a oder b oder beides true ist

        System.out.println();

        System.out.println(5 & 7); // Erzeugen Zahlen
        // 0101
        // 0111
        // 0101 : 5

        System.out.println(5 | 7); // Erzeugen Zahlen
        // 0101
        // 0111
        // 0111 : 7

        //System.out.println(5 && 7); // Mit Zahlen sind bei Logischen nicht möglich, nur boolean

        Object o = null;

        /*
        if(o != null & o.hashCode() > 0) { // es werden immer beide Seiten ausgeführt
            System.out.println("treffer");
        }
        */

        // arbeiten nur so lange bis ein ergebnis feststeht

        // ist die erste Bedingung false, wird die zweite Bedingung nicht mehr bearbeitet
        if(o != null && o.hashCode() > 0) {
            System.out.println("treffer");
        }

        // ist die erste Bedingung true, wird die zweite Bedingung nicht mehr bearbeitet
        /*
        if(o != null || o.hashCode() > 0) {
            System.out.println("treffer");
        }
        */

        System.out.println();

        int i = 1;
        if(i == 0 && ++i == 1) {
            System.out.println(i);
        }

        System.out.println(i);

        System.out.println();

        int j = 10;
        //sum = j++; // j wurde erst nach der zuweisung verändert, postfix
        sum = ++j; // j wurde vor der zuweisung verändert, prefix
        System.out.println("sum: " + sum);
        System.out.println("j: " + j);

        System.out.println();

        j = 0;
        //0  +  1 +  3
        sum = j++ + j++ + ++j; // postfix: veränderung muss vor der nächsten Verwendung der Variable erledigt sein
        System.out.println(sum);

        j++; ++j; // kein Unterschied. Vor der nächsten Verwendung der Variable ist beides erledigt

        o = (o == null)/* WENN TRUE */ ? /* DANN */ "Leer" : /* SONST */ o;

        System.out.println(o instanceof String); // Prüft den Typ des Objektes auf dem Heap

        o = "HALLO"; // Referenztyp ist Object, Objekttyp auf dem Heap ist String
        System.out.println(o instanceof String);

        o = 12.3; // Referenztyp ist Object, Objekttyp auf dem Heap ist Double
        System.out.println(o instanceof String);
        System.out.println(o instanceof Double);

        System.out.println(o.getClass().getSimpleName()); // liefert den Namen der Klasse
        System.out.println(o.getClass().getName()); // liefert den Namen der Klasse inkl. Paket

        System.out.println();

        Student s = new Student();
        System.out.println(s.getClass().getSimpleName());
        System.out.println(s instanceof Student); // Prüft die IS-A Beziehung
        System.out.println(s instanceof Mensch);
        System.out.println(s instanceof Object);

        // Als Referenztyp kann jede Klasse verwendet werden zu der eine IS-A Beziehung besteht
        Student s1 = new Student();
        Mensch m1 = new Student();
        Object o1 = new Student();
    }
}

class Mensch /* extends Object */ {
}

class Student extends Mensch { // Spezialisiert ein Mensch Objekt (Vererbung)
}