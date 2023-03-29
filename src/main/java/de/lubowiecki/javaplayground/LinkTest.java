package de.lubowiecki.javaplayground;

public class LinkTest {

    public static void main(String[] args) {

        ValueContainer vc = new ValueContainer("A");
        vc.setNext(new ValueContainer("B"));

        vc.getNext().setNext(new ValueContainer("C"));

        ValueContainer d = new ValueContainer("D");
        vc.getNext().getNext().setNext(d);

        ValueContainer next = vc;
        while(next != null) {
            System.out.println(next.getValue());
            next = next.getNext();
        }

        System.out.println();

        ValueContainer prev = d;
        while(prev != null) {
            System.out.println(prev.getValue());
            prev = prev.getPrev();
        }

    }
}

class ValueContainer {

    private ValueContainer prev;
    private ValueContainer next;
    private String value;

    public ValueContainer(String value) {
        this.value = value;
    }

    public ValueContainer getPrev() {
        return prev;
    }

    public void setPrev(ValueContainer prev) {
        this.prev = prev;
    }

    public ValueContainer getNext() {
        return next;
    }

    public void setNext(ValueContainer next) {
        next.setPrev(this);
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
