package de.lubowiecki.javaplayground;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsTest2 {

    public static void main(String[] args) {

        Book b1 = new Book("Kochen ohne Fett", "12345");
        Book b2 = new Book("Kochen ohne Fett", "12345");
        System.out.println(b1.equals(b2)); // Default aus Object vergleicht nur die Referenz

        //System.out.println(b1.hashCode());
        //System.out.println(b2.hashCode());

        // Set ist eine Menge. Mengen enthalten KEINE Duplikate
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        System.out.println(books);

        System.out.println();

        Set<String> namen = new HashSet<>();
        String s1 = "Peter";
        namen.add(s1);
        String s2 = new String("Peter.");
        namen.add(s2);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(namen);


    }
}

// Book erbt equals und andere Methoden von Object
class Book {

    private String title;

    private String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        int code = Objects.hash(title, isbn);
        System.out.println("HASHCODE:" + code);
        return code;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}