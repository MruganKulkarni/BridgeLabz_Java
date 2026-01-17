package Strings.Level1;
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    /*
     * Problem Statement:
     * Demonstrate NumberFormatException using Integer.parseInt()
     * and handle it using try-catch.
     */

    void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormatExceptionDemo obj = new NumberFormatExceptionDemo();

        String text = sc.next();
        obj.handleException(text);
    }
}
