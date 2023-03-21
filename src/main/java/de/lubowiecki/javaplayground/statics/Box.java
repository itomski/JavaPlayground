package de.lubowiecki.javaplayground.statics;

import java.time.LocalDateTime;

public class Box {

    public static int counter; // existiert nur 1x im Bauplan/Klasse und wird von allen Objekten der Klasse-Box verwendet

    private int nr; // Standardwert für int = 0

    private String content; // Instanzvariable

    private LocalDateTime createdAt; // Instanzvariable

    public Box(String content) {
        nr = ++counter; // Zählt die nr um 1 hoch
        this.content = content;
        createdAt = LocalDateTime.now(); // Aktuelles Datum wird eingetragen
    }

    @Override
    public String toString() {
        return "Box{" +
                "nr=" + nr +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
