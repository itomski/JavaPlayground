package de.lubowiecki.javaplayground.collections;

import java.time.LocalTime;

public class Termin implements Comparable<Termin> {

    private LocalTime time;
    private String text;

    public Termin() {
    }

    public Termin(LocalTime time, String text) {
        this.time = time;
        this.text = text;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "time=" + time +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public int compareTo(Termin other) {
        return time.compareTo(other.time);
    }
}
