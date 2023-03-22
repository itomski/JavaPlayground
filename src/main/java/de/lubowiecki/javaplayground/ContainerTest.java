package de.lubowiecki.javaplayground;

public class ContainerTest {

    public static void main(String[] args) {

        Container c1 = new Container();
        c1.setContent("Das ist ein Haus von Nikigraus...");
        System.out.println(c1.getContent());

        c1 = new Container(); // Objekt-Referenz wurde überschrieben
        System.out.println(c1.getContent());

        System.out.println("-----------");

        final Container c2 = new Container();
        c2.setContent("Das ist ein Haus von Nikigraus...");
        System.out.println(c2.getContent());

        //c2 = new Container(); // Referenz kann nicht geändert werden!
        c2.setContent("....");
        System.out.println(c2.getContent());

        System.out.println("-----------");

        // final kann nur bei der Deklaration verwendet werden

        ImmutableContainer c3 = new ImmutableContainer("Bla bla bla bla");
        c3 = new ImmutableContainer("Xyz"); // Kann neu zugewiesen werden, da c3 nicht final ist
        // Zustand kann nicht geändert werden

        String s = "Hallo";
        s.concat(" Welt"); // Ändert nicht den alten String, sondern erzeugt einen neuen
        s = s.concat(" Welt"); // Die Referenz wird auf den neuen String versetzt
        System.out.println(s);
    }
}

class ImmutableContainer {

    private final String content;

    public ImmutableContainer(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Container {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


