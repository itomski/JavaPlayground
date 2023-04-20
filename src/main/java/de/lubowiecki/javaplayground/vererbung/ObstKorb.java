package de.lubowiecki.javaplayground.vererbung;

public class ObstKorb {

    public static void main(String[] args) {

        Apfel a = new Apfel();
        System.out.println(a.typ);
        System.out.println(a.getTyp());

        System.out.println();

        Obst o = a; // Apfel IS-A Obst
        System.out.println(o.typ);
        System.out.println(o.getTyp());

        System.out.println();

        //Birne b = (Birne) a; // Apfeln IS-A Brine? NÖ!

        System.out.println();

        // Zur Laufzeit: ClassCastException
        //Birne b = (Birne) o; // Obst IS-A Birne? Könnte sein. Kann erst zur Laufzeit geprüft werden.

        // Zur Laufzeit: KEINE ClassCastException, Objekt hinter o ist wirklich ein Apfel
        Apfel a2 = (Apfel) o; // Obst IS-A Apfel? Könnte sein. Kann erst zur Laufzeit geprüft werden.

        System.out.println();

        Birne birne = new Birne();
        System.out.println(birne.typ);
        System.out.println(birne.getTyp());

        Essbar e = birne; // Birne IS-A Essbar

        Birne birne1 = (Birne) e; // e IS-A Birne? Könnte sein! Cast ist ok!
        //Apfel apfel1 = (Apfel) e; // e IS-A Apfel? Könnte sein! ClassCastException

        if(e instanceof Birne) {
            System.out.println("e ist Birne");
        }

        if(e instanceof Apfel) {
            System.out.println("e ist Apfel");
        }
    }
}

interface Essbar {
}

class Obst implements Essbar {
    public String typ = "Obst";

    public String getTyp() {
        return typ;
    }
}

class Apfel extends Obst {
    public String typ = "Apfel";

    @Override
    public String getTyp() {
        return typ;
    }
}

class Birne extends Obst {
    public String typ = "Birne";

    @Override
    public String getTyp() {
        return typ;
    }
}
