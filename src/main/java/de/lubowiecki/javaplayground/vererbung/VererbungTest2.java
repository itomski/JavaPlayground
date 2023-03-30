package de.lubowiecki.javaplayground.vererbung;

public class VererbungTest2 {

    public static void main(String[] args) {

        XBox xb = new XBox();
        System.out.println(xb.machWas());

        YBox yb = new YBox();
        System.out.println(yb.machWas());

        //xb = yb; // Instanzmethoden werden IMMER auf dem Objekttyp (Heap) ausgeführt
        //System.out.println(xb.machWas());

    }
}

final class XBox {
    public String machWas() {
        return "XBox";
    }
}

class YBox {

    public String machWas() {
        return "YBox";
    }
}
