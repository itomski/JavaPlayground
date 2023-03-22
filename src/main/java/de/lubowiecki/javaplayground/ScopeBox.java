package de.lubowiecki.javaplayground;

public class ScopeBox {

    private static int staticZahl = 10; // Klassenvariable

    private int zahl = 20; // Instanzvariable

    public void machWas() {
        int localZahl = 30; // Lokale Variable
    }

    public static int getStaticZahl() {
        return staticZahl;
    }

    public int getZahl() {
        return zahl;
    }
}
