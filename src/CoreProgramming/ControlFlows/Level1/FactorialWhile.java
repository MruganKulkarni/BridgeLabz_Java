import java.util.Scanner;

class FactorialWhile

/*
 * Problem Statement:
 * Write a program to calculate the factorial of a given number
 * using a while loop. The program should compute the factorial
 * iteratively.
 *
 * This problem demonstrates multiplicative iteration.
 */
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
