package ControlFlows.Level3;

import java.util.Scanner;

class P04_PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        }
        else {
            // Check divisibility from 2 till number-1
            for (int i = 2; i < number; i++) {

                // If divisible by any number other than 1 and itself, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } 
        else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}
