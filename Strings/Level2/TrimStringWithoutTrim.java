package Strings.Level2;
import java.util.Scanner;

public class TrimStringWithoutTrim {

    /*
     * Problem Statement:
     * Trim leading and trailing spaces from a string
     * using charAt() and compare with trim().
     */

    int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Find first non-space character
        while (text.charAt(start) == ' ') start++;

        // Find last non-space character
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    String substring(String text, int start, int end) {
        String result = "";

        // Build substring manually
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrimStringWithoutTrim obj = new TrimStringWithoutTrim();

        String text = sc.nextLine();
        int[] idx = obj.findTrimIndexes(text);

        String manual = obj.substring(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Same result: " +
                obj.compareStrings(manual, builtIn));
    }
}
