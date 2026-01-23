package Strings.Level1;
public class ArrayIndexOutOfBoundsDemo {

    /*
     * Problem Statement:
     * Demonstrate ArrayIndexOutOfBoundsException
     * and handle it using try-catch.
     */

    void handleException() {
        try {
            int[] arr = {1, 2, 3};
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsDemo obj = new ArrayIndexOutOfBoundsDemo();
        obj.handleException();
    }
}
