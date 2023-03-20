package de.lubowiecki.javaplayground.fahrzeugverwaltung;

public class Fahrzeug {

    private String marke;

    private String typ;

    private String kennzeichen;

    private int geschwindigkeit;

    private boolean motorAn;

    private Person fahrer;

    public Fahrzeug(String marke, String typ, String kennzeichen) {
        this.marke = marke;
        this.typ = typ;
        this.kennzeichen = kennzeichen;
    }

    public void beschleunigen(int kmh) {
        // TODO: kmh auf Vorzeichen prüfen
        if(motorAn) {
            geschwindigkeit += kmh;
        }
        else {
            System.out.println("Motor ist noch aus!");
        }
    }

    public void abbremsen(int kmh) {
        // TODO: kmh auf Vorzeichen prüfen
        if(geschwindigkeit <= 0) {
            System.out.println("Das Auto steht bereits.");
        }
        else {
            geschwindigkeit -= kmh;
            geschwindigkeit = (geschwindigkeit < 0) ? 0 : geschwindigkeit;
        }
    }

    public void starteMotor() {
        if(fahrer != null) {
            motorAn = true;
        }
    }

    public void stopMotor() {
        motorAn = false;
        geschwindigkeit = 0;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setFahrer(Person person) {
        if(person.getAlter() > 18) {
            fahrer = person;
        }
        else {
            System.out.println("Der Fahrer ist zu jung!");
        }
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", typ='" + typ + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                ", motorAn=" + motorAn +
                ", fahrer=" + fahrer +
                '}';
    }

    // Erweiterung:
    // Entwerfe eine Klasse Person
    // Ein Objekt der Person kann als Fahrer dem Fahrzeug zugewiesen werden
    // Die Person soll einen Vor- und Nachnamen, sowie Alter haben.
    // Ist die Person keine 18 Jahre, darf sie nicht als Fahrer eingesetzt werden

}
