package Strings.Level3;
import java.util.Scanner;

public class CharacterOccurrences {

    /*
     * This program identifies all occurrences of a given character in a string.
     * It first counts how many times the character appears and then stores
     * the index positions of each occurrence in an integer array.
     * The logic is implemented using charAt() and basic loops.
     */

    int[] findOccurrences(String text, char ch) {
        int count = 0;

        // Count how many times the character appears
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        int[] positions = new int[count];
        int index = 0;

        // Store index positions of each occurrence
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                positions[index++] = i;
            }
        }

        return positions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterOccurrences obj = new CharacterOccurrences();

        String text = sc.nextLine();
        char ch = sc.next().charAt(0);

        int[] result = obj.findOccurrences(text, ch);

        for (int pos : result) {
            System.out.print(pos + " ");
        }
    }
}
