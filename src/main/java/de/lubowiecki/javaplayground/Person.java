package de.lubowiecki.javaplayground;

// Entity, ValueObjects (VO), DataObjects, JavaBean (Konvention)
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Person {

    private String firstname; // Standard alle Objekttypen für Klassen- und Instanzvariablen ist null

    private String lastname;

    private LocalDate birthDate;

    private boolean active;

    // Parameterloser-Konstruktor muss bei JavaBeans immer dabei sein!
    public Person() {
    }

    public Person(String firstname, String lastname, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFormattedBirthDate() {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(birthDate);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
