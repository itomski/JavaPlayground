package de.lubowiecki.javaplayground.vererbung;

import java.util.List;

// ORM - Objekt Relationales Mapping - Übersetzt zwischen Java und DB
// CRUD - Create, Read, Update, Delete
public interface Mapper {

    int zahl = 10; // public static final

    void insert(Customer c);

    void update(Customer c);

    Customer findById(int id);

    List<Customer> findAll();

    void delete(Customer c);

    default void machWas() { // Standardimplementierung
        //...
    }

}
