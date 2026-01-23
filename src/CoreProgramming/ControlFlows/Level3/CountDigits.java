package ControlFlows.Level3;

import java.util.Scanner;

class P06_CountDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;

        // Loop until number becomes zero
        while (number != 0) {

            // Remove last digit in each iteration
            number = number / 10;
            count++;
        }

        System.out.println("Total Digits = " + count);
        input.close();
    }
}
