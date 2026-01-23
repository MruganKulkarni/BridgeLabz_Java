package Strings.Level1;
public class NullPointerExceptionDemo {

    /*
     * Problem Statement:
     * Demonstrate NullPointerException by accessing a String
     * initialized to null and then handle it using try-catch.
     */

    void generateException() {
        String text = null;
        text.length(); // Triggers exception
    }

    void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        NullPointerExceptionDemo obj = new NullPointerExceptionDemo();
        obj.handleException();
    }
}
