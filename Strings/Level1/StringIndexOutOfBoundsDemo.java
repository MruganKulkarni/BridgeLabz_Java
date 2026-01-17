package Strings.Level1;
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    /*
     * Problem Statement:
     * Demonstrate StringIndexOutOfBoundsException using charAt()
     * and handle it using try-catch.
     */

    void handleException(String text) {
        // try catch block
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringIndexOutOfBoundsDemo obj = new StringIndexOutOfBoundsDemo();

        String text = sc.next();
        obj.handleException(text);
    }
}
