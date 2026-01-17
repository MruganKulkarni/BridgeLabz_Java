package Strings.Level1;

import java.util.Scanner;

public class StringComparison {

    /*
     * Problem Statement:
     * Compare two strings using the charAt() method and verify
     * the result using the built-in equals() method.
     */

    boolean compareUsingCharAt(String s1, String s2) {
        // If lengths differ, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringComparison obj = new StringComparison();

        String first = sc.next();
        String second = sc.next();

        boolean result = obj.compareUsingCharAt(first, second);

        System.out.println("CharAt comparison: " + result);
        System.out.println("Equals method: " + first.equals(second));
    }
}
