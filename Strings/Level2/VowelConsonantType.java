package Strings.Level2;
import java.util.Scanner;

public class VowelConsonantType {

    /*
     * Problem Statement:
     * Identify each character as Vowel, Consonant,
     * or Not a Letter and display in tabular form.
     */

    String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        // Classify each character
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyChar(text.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelConsonantType obj = new VowelConsonantType();

        String text = sc.nextLine();
        String[][] result = obj.analyzeString(text);

        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
