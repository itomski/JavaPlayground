package de.lubowiecki.javaplayground.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeTest2 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2000, 1, 5);
        System.out.println(ld);

        ld = LocalDate.of(2000, Month.DECEMBER, 5);
        System.out.println(ld);

        Month m1 = ld.getMonth(); // Enum
        int m2 = ld.getMonthValue(); // int

        Year y = Year.of(2023);
        YearMonth ym = y.atMonth(Month.FEBRUARY);
        LocalDate ld2 = ym.atDay(10);

        final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy-M-d");
        final DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("dd.MM.yy");
        final DateTimeFormatter DTF3 = DateTimeFormatter.ISO_DATE;

        // Es wird eine landesübliche Formatierung verwendet
        final DateTimeFormatter DTF4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        ld = LocalDate.parse("25-7-15", DTF);
        System.out.println(ld);
        System.out.println(ld.format(DTF));
        System.out.println(ld.format(DTF2));
        System.out.println(ld.format(DTF4));

        System.out.println();

        LocalDate now = LocalDate.now();
        LocalDate past = now.minusYears(2500);
        System.out.println(past);
        System.out.println(past.format(DateTimeFormatter.ofPattern("uuuu")));
        System.out.println(past.format(DateTimeFormatter.ofPattern("yyyy G")));

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd. MMMM yyyy")));
    }
}
