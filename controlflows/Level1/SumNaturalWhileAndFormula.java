import java.util.Scanner;

class SumNaturalWhileAndFormula
/*
 * Problem Statement:
 * Write a program to calculate the sum of the first n natural numbers
 * using a while loop and also using the mathematical formula.
 * The program should display both results.
 *
 * This problem compares iterative and formula-based approaches.
 */

 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            // Formula calculation
            int formulaSum = number * (number + 1) / 2;

            // While loop calculation
            int counter = 1;
            int whileSum = 0;

            while (counter <= number) {
                whileSum += counter;
                counter++;
            }

            System.out.println("Sum using Formula = " + formulaSum);
            System.out.println("Sum using While Loop = " + whileSum);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
