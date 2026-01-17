package Strings.Level3;
import java.util.Scanner;

public class PalindromeChecker {

    /*
     * This program checks whether a string is a palindrome.
     * The string is reversed manually and compared with
     * the original string to determine the result.
     */

    String reverse(String text) {
        String rev = "";

        // Reverse the string character by character
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker obj = new PalindromeChecker();

        String text = sc.nextLine();
        String reversed = obj.reverse(text);

        System.out.println(text.equals(reversed));
    }
}
