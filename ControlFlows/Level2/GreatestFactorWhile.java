package ControlFlows.Level2;

import java.util.Scanner;

class P10_GreatestFactorWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Loop downward to locate greatest factor
        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest Factor = " + greatestFactor);
        input.close();
    }
}

