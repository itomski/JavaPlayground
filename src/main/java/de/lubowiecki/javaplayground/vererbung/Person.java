package de.lubowiecki.javaplayground.vererbung;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {

    private String firstname;

    private String lastname;

    private LocalDate birthDate;

    public Person(boolean active) {
        // super(); // Wenn kein anderer Konstruktor hier verwendet wird, wird automatisch super() benutzt
        System.out.println("Const Person");
    }

    public Person() {
        // super(); // Wenn kein anderer Konstruktor hier verwendet wird, wird automatisch super() benutzt
        System.out.println("Const Person");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        // this.firstname = Instanzvariable
        // firstname = Lokale Variable
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, birthDate);
    }
}
