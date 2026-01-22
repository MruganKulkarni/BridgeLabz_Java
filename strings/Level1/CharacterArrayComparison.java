package Strings.Level1;

import java.util.Scanner;

public class CharacterArrayComparison {

    /*
     * Problem Statement:
     * Return all characters of a string using a user-defined method
     * and compare the result with toCharArray().
     */

    char[] getCharacters(String text) {
        char[] chars = new char[text.length()];

        // Extract characters using charAt()
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterArrayComparison obj = new CharacterArrayComparison();

        String text = sc.next();
        char[] manual = obj.getCharacters(text);
        char[] builtIn = text.toCharArray();

        System.out.println("Arrays equal: " +
                obj.compareArrays(manual, builtIn));
    }
}
