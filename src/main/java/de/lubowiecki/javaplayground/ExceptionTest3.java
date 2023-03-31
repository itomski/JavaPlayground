package de.lubowiecki.javaplayground;

public class ExceptionTest3 {

    public static void main(String[] args) {
        try {
            new ExceptionTest3().start();
        }
        catch(Exception e) {
            System.out.println("Die alte Exception hier gefangen..." + e.getMessage());
        }
    }

    private void start() throws Exception {

        try {
            machWas(-10);
        }
        catch(Exception ex) {
            // Lösung...
            throw ex; // Wirft die alte Exception neu
        }
    }

    private void machWas(int zahl) throws Exception {
        if(zahl < 0)
            throw new Exception("Grande Problem");

        System.out.println("OK");

    }


}
