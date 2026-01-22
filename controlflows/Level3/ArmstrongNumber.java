package ControlFlows.Level3;

import java.util.Scanner;

class P05_ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop until all digits are processed
        while (originalNumber != 0) {

            // Extract last digit
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum += digit * digit * digit;

            // Remove last digit from the number
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } 
        else {
            System.out.println(number + " is not an Armstrong Number");
        }

        input.close();
    }
}
