import java.util.Scanner;

class IntOperations 

/*
 * Problem Statement:
 * Write a program to perform a sequence of arithmetic operations
 * involving integer values. The program should evaluate expressions
 * using integers and display the results.
 *
 * This program highlights integer arithmetic and operator precedence.
 */
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();
        // calculation of operations
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;

        System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + ", and " + r4);

        input.close();
    }
}
