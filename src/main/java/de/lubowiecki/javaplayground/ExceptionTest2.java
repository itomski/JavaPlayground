package de.lubowiecki.javaplayground;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ExceptionTest2 {

    private ResourceBundle bundle = ResourceBundle.getBundle("messages"); // inkl. Paketnamen falls vorhanden

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        new ExceptionTest2().start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(count < 3) {
            //if(count >= 3) break;

            System.out.print(bundle.getString("value.question") + " ");

            int alter = scanner.nextInt();
            count++;

            try {
                checkAlter(alter); // Wenn eine Exception geworfen wird, wird sofort der chatch-Block angesteuert
                break; // diese Zeile wird NUR ausgeführt, wenn keine Exception erfolgt
            }
            catch (WertNegativException e) {
                System.out.println(bundle.getString("value.negative"));
                //System.out.println(e.getMessage());
            }
            /*
            catch(ZuJungException e) {
                System.out.println(bundle.getString("value.jung"));
            }
            catch(ZuAltException e) {
                System.out.println(bundle.getString("value.old"));
            }
            */ catch (ZuJungException | ZuAltException e) { // Multicatch
                System.out.println(bundle.getString("value.invalid"));
            }
            catch (RuntimeException e) {
                //...
            }
        }

        System.out.println("...");

        machWas(12);

    }

    private void checkAlter(int alter) throws WertNegativException, ZuJungException, ZuAltException {

        if(alter < 0) {
            throw new WertNegativException();
        }
        else if(alter < 18) {
            throw new ZuJungException();
        }
        else if(alter > 80) {
            throw new ZuAltException();
        }

        System.out.println(bundle.getString("value.welcome"));
    }

    void machWas(int index) {

        int[] arr = new int[10];

        try {
            System.out.println(arr[index]);
            return;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem: Index nicht verfügbar");
        }
        finally { // Wird immer ausgeführt!
            System.out.println("Bis zum nächsten mal!");
        }
    }
}

class WertNegativException extends RuntimeException {
    public WertNegativException(String message) {
        super(message);
    }

    public WertNegativException() {
    }
}

class ZuJungException extends RuntimeException {
    public ZuJungException(String message) {
        super(message);
    }

    public ZuJungException() {
    }
}

class ZuAltException extends RuntimeException {
    public ZuAltException(String message) {
        super(message);
    }

    public ZuAltException() {
    }
}
