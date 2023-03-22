package de.lubowiecki.javaplayground;

public class FinalizerTest {

    public static void main(String[] args) {

        FinalizerTest a = new FinalizerTest();
        FinalizerTest b = new FinalizerTest();
        FinalizerTest c = new FinalizerTest();
        FinalizerTest d = new FinalizerTest();

        a = null;
        b = null;
        c = null;
        d = null;

        System.gc(); // Bittet den GC um Abholung des Mülls
        //System.exit(0); // Verlässt das Programm
        System.out.println(System.getenv("HOME"));
        System.out.println(System.getProperties()); // Liest alle Properties ein
        System.out.println(System.getProperty("user.home")); // Lies eine Property ein
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHRRRRRRRR.......");
    }
}
