import java.util.Scanner;

class DivisibleBy5
/*
 * Problem Statement:
 * Write a program to check whether a given number is divisible by 5.
 * The program should evaluate the divisibility condition and display
 * an appropriate message based on the result.
 *
 * This problem focuses on conditional checking using arithmetic logic.
 */

{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String decision = "No";
        // condition for checking divisibility
        if(num % 5 == 0)
        {
             decision = "Yes";
        }

        System.out.println("Is the number\s" + num + "\sdivisble by 5?\s" + decision );

    }
}