package de.lubowiecki.javaplayground.orm;

public class Ordering extends AbstractEntity {

    private String customer;

    private double total;

    public Ordering() {
    }

    public Ordering(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ordering{" +
                "id=" + getId() +
                ", customer='" + customer + '\'' +
                ", total=" + total +
                '}';
    }
}
