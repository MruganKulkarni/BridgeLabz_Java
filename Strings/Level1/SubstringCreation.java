package Strings.Level1;

import java.util.Scanner;

public class SubstringCreation {

    /*
     * Problem Statement:
     * Create a substring using charAt() and compare it with
     * the built-in substring() method.
     */

    String createSubstring(String text, int start, int end) {
        String result = "";

        // Build substring character by character
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    boolean compareStrings(String s1, String s2) {
        // Compare strings character by character
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubstringCreation obj = new SubstringCreation();

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String manual = obj.createSubstring(text, start, end);
        String builtIn = text.substring(start, end);

        System.out.println("Comparison result: " +
                obj.compareStrings(manual, builtIn));
    }
}
