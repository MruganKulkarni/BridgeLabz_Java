import java.util.Scanner;

class P11_SumUntilZeroOrNegative
/*
 * Problem Statement:
 * Write a program to calculate the sum of numbers entered by the user
 * until a zero or negative number is encountered. The program should
 * terminate when the stopping condition is met.
 *
 * This problem focuses on conditional loop termination.
 */
 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Break if zero or negative
            if (number <= 0) {
                break;
            }

            // Add to total
            total += number;
        }

        // Display result
        System.out.println("The total sum is " + total);

    }
}
