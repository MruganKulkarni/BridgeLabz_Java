package Strings.Level3;
import java.util.Scanner;

public class AnagramChecker {

    /*
     * This program checks whether two strings are anagrams.
     * It compares the frequency of characters in both strings
     * to determine whether they contain the same characters.
     */

    int[] getFrequency(String text) {
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        return freq;
    }

    boolean compareFrequency(int[] a, int[] b) {
        // Compare frequency arrays
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnagramChecker obj = new AnagramChecker();

        String first = sc.nextLine();
        String second = sc.nextLine();

        System.out.println(obj.compareFrequency(
                obj.getFrequency(first),
                obj.getFrequency(second)
        ));
    }
}
