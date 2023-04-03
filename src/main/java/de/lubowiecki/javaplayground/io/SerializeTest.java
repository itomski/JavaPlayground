package de.lubowiecki.javaplayground.io;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializeTest {

    private static final String SER_FILE = "personen.ser";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(2002, 5, 22)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1998, 7, 2)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(2003, 1, 1)));
        personen.add(new Person("Tony", "Stark", LocalDate.of(1982, 3, 18)));
        System.out.println(personen);
        */

        //saveToFile(personen, SER_FILE);

        try {
            List<Person> personen = readFromFile(SER_FILE);

            for (Person person : personen) {
                System.out.println(person);
            }

            System.out.println();

            System.out.print("Vorname: ");
            // var Seit Java 10
            var firstName = scanner.nextLine();
            System.out.print("Nachname: ");
            var lastName = scanner.nextLine();

            personen.add(new Person(firstName, lastName, LocalDate.now()));

            saveToFile(personen, SER_FILE);
        }
        catch (Exception e) {
            System.out.println("Problem beim Lesen");
        }
    }

    private static void saveToFile(List<Person> personen, String fileName) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(personen);
        }
    }

    private static List<Person> readFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Person> personen = (List<Person>) in.readObject();
            return personen;
        }
    }
}
