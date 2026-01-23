package Strings.Level2;
import java.util.Scanner;

public class ShortestAndLongestWord {

    /*
     * Problem Statement:
     * Split text into words and determine the shortest
     * and longest word in the sentence.
     */

    String[] splitWords(String text) {
        return text.split(" ");
    }

    String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        // Compare lengths to find extremes
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShortestAndLongestWord obj = new ShortestAndLongestWord();

        String text = sc.nextLine();
        String[] result = obj.findShortestAndLongest(obj.splitWords(text));

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
