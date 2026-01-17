package Strings.Level3;
import java.util.Scanner;

public class UniqueCharacters {

    /*
     * This program identifies and prints all unique characters in a string.
     * A character is considered unique if it appears exactly once in the string.
     * The logic compares each character against all others using nested loops.
     */

    boolean isUnique(String text, int index) {
        char ch = text.charAt(index);

        // Compare the character with all other positions
        for (int i = 0; i < text.length(); i++) {
            if (i != index && text.charAt(i) == ch) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniqueCharacters obj = new UniqueCharacters();

        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (obj.isUnique(text, i)) {
                System.out.print(text.charAt(i) + " ");
            }
        }
    }
}
