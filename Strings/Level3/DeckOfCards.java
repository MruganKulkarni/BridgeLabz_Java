package Strings.Level3;
public class DeckOfCards {

    /*
     * This program simulates a deck of cards using strings.
     * It generates all combinations of suits and ranks
     * and displays the complete deck.
     */

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        // Generate deck by combining ranks and suits
        for (String suit : suits) {
            for (String rank : ranks) {
                System.out.println(rank + " of " + suit);
            }
        }
    }
}
