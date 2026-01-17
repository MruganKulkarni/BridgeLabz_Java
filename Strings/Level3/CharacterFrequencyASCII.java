package Strings.Level3;
import java.util.Scanner;

public class CharacterFrequencyASCII {

    /*
     * This program calculates character frequency using an ASCII-based array.
     * Each character is mapped to its ASCII value and the frequency
     * is incremented accordingly.
     */

    int[] calculateFrequency(String text) {
        int[] freq = new int[256];

        // Increment frequency using ASCII index
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterFrequencyASCII obj = new CharacterFrequencyASCII();

        String text = sc.nextLine();
        int[] freq = obj.calculateFrequency(text);

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
