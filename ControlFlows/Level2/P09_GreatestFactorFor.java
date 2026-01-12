package ControlFlows.Level2;

import java.util.Scanner;

class P09_GreatestFactorFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int greatestFactor = 1;

        // Loop from number-1 down to 1 to find first divisible value
        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest Factor = " + greatestFactor);
        input.close();
    }
}
