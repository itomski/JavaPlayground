package de.lubowiecki.javaplayground;

public class Rechnung {

    private String nr; // AB1234
    private double betrag; // 10.99

    private final boolean DEBUG_MODE = false; // Konstante

    public Rechnung(String nr, double betrag) {
        this.nr = nr;
        this.betrag = betrag;
    }

    public String getNr() {
        return nr;
    }

    /*
    public void setNr(String nr) {
        this.nr = nr;
    }
    */

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        if(betrag > 0)
            this.betrag = betrag;

        log(); // Methoden dürfen andere Methoden der gleichen Klasse verwenden (auch private)
    }

    private void log() { // Methode kann nur von diesem Objekt verwendet werden (da private)
        if(DEBUG_MODE) System.out.println(this);
    }

    @Override
    public String toString() { // Konvertiert Rechnung in eine Zeichenkette
        //String "..." eine Zeichenkette
        //char 'a' ein einzelnes Zeichen
        return "Rechnung{nr=" + nr + ", betrag=" + betrag + "}";
        // Rechnung{nr=ABC1234, betrag=10.99};
    }
}