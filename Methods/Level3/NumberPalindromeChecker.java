package Methods.Level3;
public class NumberPalindromeChecker {

    /*
     * Problem Statement:
     * Check whether a given number is a palindrome
     * using a separate method.
     */

    boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        // Reverses the number digit by digit
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        // Compares original number with reversed number
        return original == reverse;
    }

    public static void main(String[] args) {
        NumberPalindromeChecker obj = new NumberPalindromeChecker();

        int number = 1221;
        System.out.println("Is Palindrome: " + obj.isPalindrome(number));
    }
}
