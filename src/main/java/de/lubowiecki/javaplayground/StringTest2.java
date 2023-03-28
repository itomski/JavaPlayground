package de.lubowiecki.javaplayground;

public class StringTest2 {

    public static void main(String[] args) {

        String s1 = "Hallo"; // Pool
        String s2 = "Hallo"; // eine zweite Referenz auf den Wert im Pool

        System.out.println("== " + (s1 == s2));
        System.out.println("equals " + s1.equals(s2));

        System.out.println();

        String s3 = new String("Hallo"); // Landet nicht im Pool
        System.out.println("== " + (s1 == s3));
        System.out.println("equals " + s1.equals(s3));

        System.out.println();

        String s4 = new String("Hallo"); // Landet nicht im Pool
        System.out.println("== " + (s3 == s4));
        System.out.println("equals " + s3.equals(s4));

        System.out.println();

        s1.toLowerCase(); // Referenz wird nicht gespeichert
        s1 = s1.toLowerCase(); // Die Referenz wird auf das neue String-Objekt gelegt
        System.out.println(s1);
        System.out.println(s1 + "..." + s2);

        // Es werden viele unnötige Strings gebaut
        String s = "Start: ";
        for(int i = 0; i < 65000; i++) {
            s += (char)i;
        }
        System.out.println(s);

        // Besser!
        //StringBuilder sb = new StringBuilder(); // Startgröße: 0 + 16
        //StringBuilder sb = new StringBuilder("Start"); // Startgröße: Wert-Länge + 16
        StringBuilder sb = new StringBuilder(65000); // Startgröße: 1000
        sb.append("Start: ");

        System.out.println("C:" + sb.capacity()); // innere Größe
        System.out.println("L:" + sb.length()); // Anzahl der Zeichen

        for(int i = 0; i < 65000; i++) {
            sb.append((char)i);
        }
        System.out.println(sb); // toString wird automatisch ausgeführt

        // Vergrößern = Alte Capacity * 2 + 2;

        System.out.println("C:" + sb.capacity());
        sb.trimToSize(); // Auf benötigte Größe reduzieren
        System.out.println("C:" + sb.capacity());
        System.out.println("L:" + sb.length());
    }

}
