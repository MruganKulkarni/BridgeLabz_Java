package Strings.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {

    /*
     * Problem Statement:
     * Find and return the length of a string without using
     * the built-in length() method by counting characters
     * until charAt() throws an exception.
     */

    int findLength(String text) {
        int count = 0;

        // Infinite loop until exception occurs
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates end of string
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringLengthWithoutLength obj = new StringLengthWithoutLength();

        String text = sc.next();
        System.out.println("Manual length: " + obj.findLength(text));
        System.out.println("Built-in length: " + text.length());
    }
}
