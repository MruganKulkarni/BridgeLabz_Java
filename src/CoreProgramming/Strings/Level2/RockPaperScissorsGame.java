package Strings.Level2;
import java.util.Scanner;

public class RockPaperScissorsGame {

    /*
     * Problem Statement:
     * Implement a Rock-Paper-Scissors game between user
     * and computer. The computer choice should be generated
     * randomly and the winner should be decided using rules.
     */

    String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        // Maps random number to game choice
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    String decideWinner(String user, String computer) {

        // Checks for draw condition
        if (user.equals(computer)) {
            return "Draw";
        }

        // Checks all winning conditions for user
        if (user.equals("rock") && computer.equals("scissors") ||
            user.equals("paper") && computer.equals("rock") ||
            user.equals("scissors") && computer.equals("paper")) {
            return "User Wins";
        }

        // Remaining cases imply computer wins
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RockPaperScissorsGame obj = new RockPaperScissorsGame();

        String userChoice = sc.nextLine().toLowerCase();
        String computerChoice = obj.getComputerChoice();

        System.out.println("Computer choice: " + computerChoice);
        System.out.println("Result: " +
                obj.decideWinner(userChoice, computerChoice));
    }
}
