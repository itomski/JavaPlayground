package de.lubowiecki.javaplayground;

import java.util.ArrayList;

public class VererbungTest {

    public static void main(String[] args) {

        Hero spiderman = new Hero();
        spiderman.setFirstname("Peter");
        spiderman.setLastname("Parker");
        spiderman.setForce("Netz");
        spiderman.setName("Spiderman");

        Normalo hans = new Normalo();
        hans.setFirstname("Hans");
        hans.setLastname("Hansen");

        ArrayList<Human> liste = new ArrayList<>();
        liste.add(spiderman); // Durch Vererbung besteht eine IS-A Beziehung
        liste.add(hans);
        //liste.add("Hallo"); // ist kein Human

        for(Human h : liste) {
            System.out.println(h); // toString Methode wird auf dem Objekt auf dem Heap ausgeführt
        }

        Hero sp = (Hero) liste.get(0);
        sp.setName("Venom");
    }

}

class Human {

    private String firstname;

    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class Normalo extends Human {

    @Override
    public String toString() {
        return "Normalo{" +
                "firstname='" + getFirstname() + '\'' +
                "lastname='" + getLastname() + '\''+
                '}';
    }
}

class Hero extends Human {

    private String name;

    private String force;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "firstname='" + getFirstname() + '\'' +
                "lastname='" + getLastname() + '\'' +
                "name='" + name + '\'' +
                ", force='" + force + '\'' +
                '}';
    }
}
