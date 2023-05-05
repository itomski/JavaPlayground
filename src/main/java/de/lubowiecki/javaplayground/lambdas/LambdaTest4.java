package de.lubowiecki.javaplayground.lambdas;

public class LambdaTest4 {

    public static void main(String[] args) {

        machWas(new Child());
        // Lambdas sind nur da erlaubt, wo FunctionalInterfaces als Parameter verlangt werden
        // machWas(() -> System.out.println("")); // Child wird verlangt, Parent wird eingesetzt

        Child c = new Child();
        Parent p = c;
        c = (Child) p; // Geht nicht

        p = () -> System.out.println("");
        p = () ->  {
            System.out.println("");
            //return; // Optional
        };
        c = (Child) p; // Ist kein Child. Zur Laufzeit ClassCastException

        String s = "String"; // Child von Object(Parent)
        Object o = s; // String IS-A Object, Child IS-A Parent
        s = (String) o; // Lässt sich nur casten, wenn hinter o wirklich ein String steht


        Machbar m = (d) -> {
                d = 10.2;
                return "Proof";
        };


    }

    static void machWas(Child p) {

    }
}

// Predicate
interface Parent {
    void doSomething();
}

// Filter
class Child implements Parent {
    public void doSomething() {

    }
}

interface Machbar {

    String machWas(Double d);

}
