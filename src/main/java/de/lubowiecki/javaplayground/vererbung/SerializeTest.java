package de.lubowiecki.javaplayground.vererbung;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializeTest {

    private static final String FILE_NAME = "data.ser";

    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstname("Peter");
        p.setLastname("Parker");
        p.setBirthDate(LocalDate.of(1997, 10, 5));

        // IO - Input und Output
        try(FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(p);

        }
        catch(Exception e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p2 = (Person) ois.readObject();

            System.out.println(p.equals(p2));

            System.out.println(p2.getFirstname() + " " + p2.getLastname() + ", " + p2.getBirthDate());

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
