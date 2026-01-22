package ControlFlows.Level3;

import java.util.Scanner;

class P08_HarshadNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop to calculate sum of digits
        while (originalNumber != 0) {

            // Extract each digit
            int digit = originalNumber % 10;

            // Add digit to sum
            sum += digit;

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check if number is divisible by sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } 
        else {
            System.out.println(number + " is not a Harshad Number");
        }

        input.close();
    }
}
