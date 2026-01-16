import java.util.Scanner;

class RocketCountdownWhile
/*
 * Problem Statement:
 * Write a program to simulate a rocket countdown using a while loop.
 * The program should display numbers in descending order until
 * the countdown reaches zero.
 *
 * This problem demonstrates loop-based iteration.
 */
 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take starting counter value
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

    }
}
