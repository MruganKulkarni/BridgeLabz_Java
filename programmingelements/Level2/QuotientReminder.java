import java.util.Scanner;

class QuotientReminder

/*
 * Problem Statement:
 * Write a program to calculate the quotient and remainder when one
 * number is divided by another. The program should display both
 * values clearly.
 *
 * This program demonstrates division and modulus operations in Java.
 */
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int number2 = input.nextInt();
        // calculate quotient
        int quotient = number1 / number2;
        // calculate remainder
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);

        input.close();
    }
}
