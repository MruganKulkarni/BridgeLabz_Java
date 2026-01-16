import java.util.Scanner;


class NaturalNumberSum

/*
 * Problem Statement:
 * Write a program to calculate the sum of the first n natural numbers.
 * The program should use a loop to iteratively compute the total sum.
 *
 * This problem introduces iterative control structures.
 */
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number > 0) {

            // Compute sum using formula
            int sumOfNaturalNumbers = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
