package Strings.Level2;
import java.util.Scanner;

public class SplitTextWithoutSplit {

    /*
     * Problem Statement:
     * Split a sentence into words without using split()
     * and compare the result with built-in split().
     */

    int countWords(String text) {
        int count = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    String[] splitManually(String text) {
        int words = countWords(text);
        String[] result = new String[words];

        int index = 0;
        String temp = "";

        // Build words character by character
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }

        result[index] = temp;
        return result;
    }

    boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SplitTextWithoutSplit obj = new SplitTextWithoutSplit();

        String text = sc.nextLine();

        String[] manual = obj.splitManually(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison result: " +
                obj.compareArrays(manual, builtIn));
    }
}
