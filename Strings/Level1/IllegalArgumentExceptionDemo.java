package Strings.Level1;
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    /*
     * Problem Statement:
     * Demonstrate IllegalArgumentException using substring()
     * with invalid indexes and handle it.
     */

    void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IllegalArgumentExceptionDemo obj = new IllegalArgumentExceptionDemo();

        String text = sc.next();
        obj.handleException(text);
    }
}
