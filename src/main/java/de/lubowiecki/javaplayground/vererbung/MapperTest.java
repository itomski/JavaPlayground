package de.lubowiecki.javaplayground.vererbung;

public class MapperTest {

    public static void main(String[] args) {

        // Referenztyp      // Objekttyp: Heap
        Mapper mapper = new ConcretMapper();
        mapper.machWas();

        // Instanzmethoden werden auf dem Objekttyp ausgeführt

        Customer c = mapper.findById(10);

        AbstractMapper am = new ConcretMapper();
        am.machWas();


    }
}
