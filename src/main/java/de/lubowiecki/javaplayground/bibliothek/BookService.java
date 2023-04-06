package de.lubowiecki.javaplayground.bibliothek;

import java.util.*;
import java.util.function.Consumer;

public class BookService {

    public static final Consumer<Book> LONG = (book) -> System.out.printf("%05d, %s, %s, %s, %.2f € \n", book.getNr(), book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPrice());
    public static final Consumer<Book> NORMAL = (book) -> System.out.println(book.getNr() + ", " + book.getTitle() + ", " + book.getAuthor());
    public static final Consumer<Book> SHORT = (book) -> System.out.println(book.getNr() + ", " + book.getTitle());

    public static final Comparator<Book> NR = (a, b) -> a.getNr() - b.getNr();
    public static final Comparator<Book> TITLE = (a, b) -> a.getTitle().compareTo(b.getTitle());
    public static final Comparator<Book> AUTOR = (a, b) -> a.getAuthor().compareTo(b.getAuthor());
    public static final Comparator<Book> ISBN = (a, b) -> a.getIsbn().compareTo(b.getIsbn());
    public static final Comparator<Book> PRICE = (a, b) -> Double.compare(a.getPrice(), b.getPrice());

    private final BookRepository repository = new BookRepository();
    private final Scanner scanner;

    public BookService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printAll() {
        printAll(NORMAL);
    }

    public void printAll(Consumer<Book> consumer) {
        printAll(consumer, NR);
    }

    public void printAll(Consumer<Book> consumer, Comparator<Book> comparator) {
        List<Book> list = new ArrayList<>(repository.find());
        list.sort(comparator); // Sortieren
        list.forEach(consumer); // Ausgeben
    }

    public void createBook() {
        System.out.print("Titel: ");
        String title = scanner.nextLine();

        System.out.print("Autor: ");
        String author = scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Preis: ");
        double price = scanner.nextDouble(); // Schreibweise für die Eingabe ist an den Sprachraum angepasst
        scanner.nextLine(); // fix

        Book book = new Book(title, author, isbn, price);
        save(book);
    }

    public void save(Book book) {
        repository.save(book);
    }

    public String generateIsbn() {
        return UUID.randomUUID().toString();
    }
}
