package ControlFlows.Level2;

import java.util.Scanner;

class P08_FactorsWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int counter = 1;

        // Run till counter is less than number
        while (counter < number) {

            // Print counter if it divides the number
            if (number % counter == 0) {
                System.out.println(counter);
            }

            counter++;
        }

        input.close();
    }
}
