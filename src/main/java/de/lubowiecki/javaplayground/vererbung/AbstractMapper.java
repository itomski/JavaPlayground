package de.lubowiecki.javaplayground.vererbung;

import java.util.List;

public abstract class AbstractMapper implements Mapper {

    @Override
    public Customer findById(int id) {
        // TODO: zu ende implementieren
        return null;
    }

    @Override
    public List<Customer> findAll() {
        // TODO: zu ende implementieren
        return null;
    }

    public abstract void machWasAnderes();
}
