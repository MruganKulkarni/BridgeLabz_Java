package Strings.Level3;
import java.util.Scanner;

public class CharacterFrequencyNested {

    /*
     * This program calculates character frequency using nested loops
     * without using extra arrays. Each character's count is printed once.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            boolean visited = false;

            // Check if character already processed
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            // Count occurrences of the character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            System.out.println(text.charAt(i) + " : " + count);
        }
    }
}
