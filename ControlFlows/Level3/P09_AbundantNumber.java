package ControlFlows.Level3;

import java.util.Scanner;

class P09_AbundantNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;

        // Loop to find all divisors except the number itself
        for (int i = 1; i < number; i++) {

            // If i divides number completely, it is a divisor
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } 
        else {
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}
