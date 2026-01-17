package Strings.Level2;
import java.util.Scanner;

public class StudentVotingEligibility {

    /*
     * Problem Statement:
     * Accept student details such as name and age.
     * Determine whether the student is eligible to vote
     * based on age criteria (18 years or above).
     */

    boolean isEligibleToVote(int age) {
        // Checks voting eligibility condition
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVotingEligibility obj = new StudentVotingEligibility();

        String name = sc.nextLine();
        int age = sc.nextInt();

        // Evaluates eligibility and prints result
        if (obj.isEligibleToVote(age)) {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + " is not eligible to vote");
        }
    }
}
