package de.lubowiecki.javaplayground;

import de.lubowiecki.javaplayground.io.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashSet;
import java.util.Set;

public class StringFormatTest {

    public static void main(String[] args) {


        Set<Person> personen = new HashSet<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(2010, 1,5)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(2010, 1,5)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(2010, 1,5)));
        personen.add(new Person("Tony", "Stark", LocalDate.of(2010, 1,5)));

        StringBuilder sb = new StringBuilder();

        final String TPL = "%-15s | %-15s | %-12s \n";
        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        sb.append(String.format(TPL, "VORNAME", "NACHNAME", "GEBURTSDATUM"));
        sb.append("-------------------------------------------------\n");


        for (Person person : personen) {
            sb.append(String.format(TPL, person.getFirstname(), person.getLastname(), person.getBirthDate().format(FMT)));
        }

        System.out.println(sb);

    }
}
