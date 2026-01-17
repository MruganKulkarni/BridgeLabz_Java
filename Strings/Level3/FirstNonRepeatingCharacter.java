package Strings.Level3;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    /*
     * This program finds the first non-repeating character in a string.
     * It checks each character and determines whether it appears
     * more than once using nested loops.
     */

    boolean isRepeating(String text, int index) {
        char ch = text.charAt(index);

        // Check if character appears elsewhere
        for (int i = 0; i < text.length(); i++) {
            if (i != index && text.charAt(i) == ch) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (!obj.isRepeating(text, i)) {
                System.out.println(text.charAt(i));
                break;
            }
        }
    }
}
