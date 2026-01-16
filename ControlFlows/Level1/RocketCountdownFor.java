import java.util.Scanner;

class RocketCountdownFor
/*
 * Problem Statement:
 * Write a program to simulate a rocket countdown using a for loop.
 * The program should display numbers in descending order until
 * the countdown completes.
 *
 * This problem compares different looping constructs.
 */
 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take starting counter value
        System.out.print("Enter countdown start number: ");
        int number = input.nextInt();

        // Countdown using for loop
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
