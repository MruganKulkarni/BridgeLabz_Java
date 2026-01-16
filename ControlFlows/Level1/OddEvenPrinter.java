import java.util.Scanner;

class OddEvenPrinter

/*
 * Problem Statement:
 * Write a program to print whether numbers within a given range
 * are odd or even. The program should evaluate each number and
 * display the corresponding result.
 *
 * This problem applies looping with conditional checks.
 */
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {
            
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } 
                else {
                    System.out.println(i + " is Odd");
                }
            }
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
