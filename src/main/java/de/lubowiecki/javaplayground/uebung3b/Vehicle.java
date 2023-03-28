package de.lubowiecki.javaplayground.uebung3b;

public class Vehicle {

    private String registration;

    private String brand;

    private String type;

    private VehicleStatus status = VehicleStatus.FREI;

    public Vehicle() {
    }

    public Vehicle(String registration, String brand, String type) {
        this.registration = registration;
        this.brand = brand;
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registration='" + registration + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
