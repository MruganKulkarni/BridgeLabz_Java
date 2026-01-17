package Strings.Level2;
import java.util.Scanner;

public class WordsWithLength2D {

    /*
     * Problem Statement:
     * Split text into words and store each word with its
     * corresponding length in a 2D array.
     */

    int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    String[] splitWords(String text) {
        return text.split(" ");
    }

    String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        // Store word and its length
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordsWithLength2D obj = new WordsWithLength2D();

        String text = sc.nextLine();
        String[][] result = obj.createWordLengthTable(obj.splitWords(text));

        // Display in tabular format
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
