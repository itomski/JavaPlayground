package de.lubowiecki.javaplayground;

public class OverloadingTest3 {

    public static void main(String[] args) {

        Parent p = new Child();
        p.machWas();
        //p.machWas(true); // über Parent-Refenz nicht sichtbar

    }
}

class Parent {

    public void machWas() {
        System.out.println(this.getClass().getSimpleName());
    }
}

class Child extends Parent {

    @Override
    public void machWas() {
        System.out.println(this.getClass().getSimpleName());
    }

    public void machWas(boolean b) {
        System.out.println(this.getClass().getSimpleName() + ": " + b);
    }
}
