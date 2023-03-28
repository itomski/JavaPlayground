package de.lubowiecki.javaplayground.uebung3b;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleRepository {

    //private Vehicle[] vehicles = new Vehicle[10];

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    /*
    public boolean add(Vehicle v) {
        int i = getNextFree();
        if(i < 0) return false;

        vehicles[i] = v;
        return true;
    } */

    public boolean add(Vehicle v) {
        if(v == null)
            return false;

        return vehicles.add(v); // fügt ein ein Element ans Ende der Liste hinzu
    }

    /*
    private int getNextFree() {
        for(int i = 0; i < vehicles.length; i++)
            if(vehicles[i] == null)
                return i;

        return -1;
    } */

    public String print() {
        StringBuilder sb = new StringBuilder(); // Veränderbarer String
        for(Vehicle v : vehicles) {
            if(v == null) continue; // Springt zum nächsten Schleifendurchlauf
            sb.append(v.getRegistration())
                    .append(", ")
                    .append(v.getBrand())
                    .append(", ")
                    .append(v.getType())
                    .append(", ")
                    .append(v.getStatus())
                    .append("\n");
        }

        return sb.toString();
    }

    public Vehicle findByRegistration(String registration) {
        for(Vehicle v : vehicles) {
            if(v.getRegistration().equals(registration))
                return v;
        }
        return null;
    }


    @Override
    public String toString() {
        return "VehicleRepository{" +
                "vehicles=" + vehicles +
                '}';
    }
}
