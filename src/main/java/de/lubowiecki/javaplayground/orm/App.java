package de.lubowiecki.javaplayground.orm;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

    private ProductMapper productMapper;

    private OrderingMapper orderingMapper;

    private final Scanner scanner = new Scanner(System.in);

    public App() {
        try {
            productMapper = new ProductMapper();
            orderingMapper = new OrderingMapper();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        new App().start();
    }

    public void start() {

        app: while(true) {
            System.out.print("Auswahl: ");
            String input = scanner.nextLine().trim().toLowerCase();

            try {
                switch(input) {

                    case "o":
                        orderingMapper.find().forEach(o -> System.out.println(o));
                        break;

                    case "p":
                        productMapper.find().forEach(p -> System.out.println(p));
                        break;

                    case "pi":
                        Product product = new Product();
                        System.out.print("Name: ");
                        product.setName(scanner.nextLine());
                        System.out.print("Anzahl: ");
                        product.setQuantity(scanner.nextInt());
                        System.out.print("Preis: ");
                        product.setPrice(scanner.nextDouble());
                        scanner.nextLine(); // fix
                        product.setCreatedAt(LocalDate.now());

                        if(productMapper.insert(product)) {
                            System.out.println("Produkt wurde gespeichert");
                        }
                        break;

                    case "q":
                        System.out.println("Programm wurde beendet.");
                        break app;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
