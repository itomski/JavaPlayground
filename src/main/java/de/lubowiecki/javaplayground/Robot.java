package de.lubowiecki.javaplayground;

import java.awt.*;

public class Robot { // Jede Klasse erbt automatisch von Klasse Object

    // Objektvariablen / Instanzvariablen: Jedes Objekt hat eigene
    // Beschreiben den Zustand des Objektes

    // primitive Datentypen beginen mit Kleinbuchstaben
    boolean stationaer; // erlaubte Werte: true oder false;

    // komplexe Datentypen beginen mit Großbuchstaben (werden durch Klassen definiert)
    String farbe;

    double gewicht;

    boolean weltherrschaftsAmbitionen;

    String name;

    //int x;
    //int y;

    // private = Objekt kann nur selbst seine Eigenschaft verändern
    private Point position = new Point(); // enthält x und y mit Standardwert x:0, y:0

    public Robot(String name) {
        // name = Lokale Variable, existiert nur während der Ausführung der Methode
        // this.name = Objektvariable
        this.name = name; // lokaler Wert wird dauerhaft ins Objekt geschrieben
    }

    // Überladen von Konstruktoren = gleicher Name, andere Parameter
    public Robot(String name, boolean stationaer) {
        this.stationaer = stationaer;
        this.name = name;
    }

    /* Multiline Kommentar
    public Robot(String n) {
        name = n;
    }
    */

    public void vor() { // Methoden manipulieren den Zustand des Objekts
        if(stationaer) { // wenn
            // dann
            System.out.println(name + ": Kann sich nicht bewegen");
        }
        else {
            // sonst
            position.x++;
        }
    }

    public void zurueck() {
        if(stationaer) { // wenn
            // dann
            System.out.println(name + ": Kann sich nicht bewegen");
        }
        else {
            // sonst
            position.x--;
        }
    }

    public void links() {
    }

    public void rechts() {
    }

    @Override
    public String toString() {
        return "Robot{" +
                "stationaer=" + stationaer +
                ", farbe='" + farbe + '\'' +
                ", gewicht=" + gewicht +
                ", weltherrschaftsAmbitionen=" + weltherrschaftsAmbitionen +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
