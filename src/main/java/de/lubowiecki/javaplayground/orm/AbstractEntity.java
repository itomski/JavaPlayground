package de.lubowiecki.javaplayground.orm;

public abstract class AbstractEntity {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
