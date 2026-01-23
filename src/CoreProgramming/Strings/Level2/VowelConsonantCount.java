package Strings.Level2;
import java.util.Scanner;

public class VowelConsonantCount {

    /*
     * Problem Statement:
     * Count number of vowels and consonants in a string.
     */

    boolean isVowel(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        // Iterate through characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelConsonantCount obj = new VowelConsonantCount();

        String text = sc.nextLine();
        int[] result = obj.countVowelsConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
