package de.lubowiecki.javaplayground.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileTest {

    private static final boolean READ = true;
    private static final boolean WRITE = false;

    public static void main(String[] args) {

        File dir = new File("data"); // Erzeugt kein Verzeichnis. Ist nur ein abstrakter Verweis
        File file = new File(dir, "data.txt");

        if(!dir.exists()) {
            //dir.mkdirs(); // Baut mehrere Verzeichnisse (verschachtelt) auf einen Schlag
            dir.mkdir(); // Baut nur ein Verzeichnis
        }

        if(!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Execute:" + file.canExecute());
        System.out.println("Read:" + file.canRead());
        System.out.println("Write:" + file.canWrite());
        System.out.println("Modi:" + file.lastModified());
        System.out.println("File:" + file.isFile());
        System.out.println("Dir:" + file.isDirectory());
        System.out.println("Size:" + file.length() + " byte");

        if(WRITE) {

            /*
            Writer out = null;
            try {
                out = new FileWriter(file);
                out.append("Das ist das Haus von Nikigraus \n");
                out.close();
            }
            catch (IOException e) {
                System.out.println(e);
                if(out != null) {
                    try {
                        out.close();
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                }
            }
            */

            // try-with-ressources
            try (Writer out = new FileWriter(file, true)) {
                out.append("Das ist das Haus von Nikigraus \n");
                //out.write("Das ist das Haus von Nikigraus \n");
                // close wird automatisch ausgeführt sobald der try-block abgearbeitet ist
                // oder eine Exception geworfen wird
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        if(READ) {
            /*
            try (Reader in = new FileReader(file)) {
                int data = 0;
                while((data = in.read()) != -1) {
                    System.out.print((char)data); // Liest einen byte ein
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            */

            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String data = null;
                while((data = in.readLine()) != null) {
                    System.out.println(data); // Liest eine Zeile ein
                }
            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.println();

            // NIO
            Path path = Paths.get("data/data.txt");
            try {
                /*
                List<String> lines = Files.readAllLines(path);
                for(String line : lines) {
                    System.out.println(line);
                }
                */

                // Stream
                Files.lines(path).forEach(l -> System.out.println(l));

                // Mehrzeilige Lambdas
                //Files.lines(path).forEach(l -> {
                    //...
                //});

            }
            catch (IOException e) {
                System.out.println(e);
            }
        }

        System.out.println("ENDE");

    }
}
