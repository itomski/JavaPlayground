package de.lubowiecki.javaplayground.orm;

import java.time.LocalDate;

public class Product extends AbstractEntity {

    private String name;

    private LocalDate createdAt;

    private int quantity;

    private double price;

    public Product() {
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.createdAt = LocalDate.now();
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
