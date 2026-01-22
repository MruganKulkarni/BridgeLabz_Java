package Strings.Level3;
import java.util.Scanner;

public class CharacterFrequencyUnique {

    /*
     * This program prints the frequency of each character
     * without repeating characters in the output.
     * It ensures that each character is processed only once.
     */

    boolean isProcessed(String text, int index) {
        // Check if character appeared earlier
        for (int i = 0; i < index; i++) {
            if (text.charAt(i) == text.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    int countFrequency(String text, char ch) {
        int count = 0;

        // Count occurrences of the character
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterFrequencyUnique obj = new CharacterFrequencyUnique();

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (!obj.isProcessed(text, i)) {
                System.out.println(text.charAt(i) + " : " +
                        obj.countFrequency(text, text.charAt(i)));
            }
        }
    }
}
