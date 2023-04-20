package de.lubowiecki.javaplayground.vererbung;

public class VererbungTest3 {

    public static void main(String[] args) {

        Box box = new Box();
        box.content = "A";
        System.out.println(box.content);
        System.out.println(box.getContent());

        System.out.println();

        NextBox nbox = new NextBox();
        nbox.content = "B";
        System.out.println(nbox.content);
        System.out.println(nbox.getContent());

        System.out.println();

        // Für den Aufruf statischer Methoden und Instanz-Eigenschaften ist der Referenz-Typ relevant
        // Methoden werden auf dem Objekttyp ausgeführt (hier: NextBox)

        NextBox nbox2 = new NextBox(); // Referenz NextBox - Objekt NextBox
        nbox2.doSomething();
        System.out.println(nbox2.content);

        Box box2 = new NextBox(); // Referenz Box - Objekt NextBox
        box2.doSomething();
        System.out.println(box2.content);

        System.out.println();

        // Statische Methoden und Eigenschaften werden IMMER auf dem Referenztyp ausgeführt
        NextBox nbox4 = new NextBox(); // Referenz NextBox - Objekt NextBox
        System.out.println(nbox4.zahl);
        nbox4.doSomethingStatic();
        NextBox.doSomethingStatic();

        Box box4 = new NextBox(); // Referenz Box - Objekt NextBox
        System.out.println(box4.zahl);
        box4.doSomethingStatic();
        Box.doSomethingStatic();
    }
}

class Box {

    protected String content = "A";

    protected static int zahl = 100;

    public String getContent() {
        return content;
    }

    public void doSomething() {
        System.out.println("Box: " + content);
    }

    public static void doSomethingStatic() {
        System.out.println("Static: Box");
    }
}

class NextBox extends Box {

    protected String content = "B";

    protected static int zahl = 200;

    public String getContent() {
        return content;
    }

    @Override
    public void doSomething() {
        System.out.println("NextBox: " + content);
    }

    public static void doSomethingStatic() {
        System.out.println("Static: NextBox");
    }
}
