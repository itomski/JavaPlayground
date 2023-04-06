package de.lubowiecki.javaplayground.bibliothek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRepository {

    private static int count;

    private List<Book> books = new ArrayList<>();

    public void save(Book book) {

        if(book.getNr() == 0) {
            insert(book);
        }
        else {
            update(book);
        }
    }

    private void update(Book book) {
        // TODO: Update für ein Buch mit einer bestimmten Nummer
    }

    private void insert(Book book) {
        // Das Buch wir neu in Bestand genommen und bekommt eine neue Nr. zugewiesen
        book.setNr(++count);
        books.add(book);
    }

    public List<Book> find() {
        return Collections.unmodifiableList(books); // Gibt eine unveränderbare Version der Liste zurück
    }

    public Book findByNr(int nr) {
        // TODO: Muss implementiert werden
        throw new UnsupportedOperationException("Muss implementiert werden");
    }

    public List<Book> findByTitle(String title) {
        // TODO: Muss implementiert werden
        throw new UnsupportedOperationException("Muss implementiert werden");
    }

    public List<Book> findByAuthor(String author) {
        // TODO: Muss implementiert werden
        throw new UnsupportedOperationException("Muss implementiert werden");
    }
}
