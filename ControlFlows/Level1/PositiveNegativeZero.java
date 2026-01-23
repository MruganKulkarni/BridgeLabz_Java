import java.util.Scanner;

class PositiveNegativeZero

/*
 * Problem Statement:
 * Write a program to check whether a given number is positive,
 * negative, or zero. The program should evaluate the value and
 * display the corresponding result.
 *
 * This problem focuses on multi-branch conditional logic.
 */
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check and display result
        if (number > 0) {
            System.out.println("Positive");
        } 
        else if (number < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }

    }
}
