package de.lubowiecki.javaplayground;

public class VariablScopeTest {

    private int zahl = 100;

    public static void main(String[] args) {

        // System.out.println(zahl);
        // machWas();

        // Um Instanzinventar einer Klasse zu nutzen muss es erstmal ein Objekt davon geben
        VariablScopeTest vst = new VariablScopeTest();
        System.out.println(vst.zahl);
        vst.machWas();

        System.out.println(ScopeBox.getStaticZahl());

        ScopeBox b1 = new ScopeBox();
        System.out.println(b1.getZahl());

        b1.machWas();

        b1 = null; // Referenz wird von dem Objekt auf dem Heap getrennt
        // System.out.println(b1.getZahl()); // NullPointerException

        System.out.println(ScopeBox.getStaticZahl());
    }

    public void machWas() {
        //...
    }
}
