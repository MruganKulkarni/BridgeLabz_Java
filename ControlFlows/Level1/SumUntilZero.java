import java.util.Scanner;

class SumUntilZero
/*
 * Problem Statement:
 * Write a program that keeps accepting numbers and calculates their
 * sum until the user enters zero. The program should stop processing
 * when zero is encountered.
 *
 * This problem demonstrates loop termination using conditions.
 */
 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();

        // Continue loop until 0 is entered
        while (number != 0) {
            total += number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        // Display total sum
        System.out.println("The total sum is " + total);

    }
}
