import java.util.Scanner;

// Class to print multiplication table from 6 to 9
class MultiplicationTable

/*
 * Problem Statement:
 * Write a program to display the multiplication table of a given
 * number. The program should use a loop to generate and display
 * the table.
 *
 * This problem reinforces loop-based repetition.
 */
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // multiplication
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
