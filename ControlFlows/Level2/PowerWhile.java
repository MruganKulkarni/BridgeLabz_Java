package ControlFlows.Level2;

import java.util.Scanner;

class P14_PowerWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;
        int counter = 1;

        // Multiply number until counter equals power
        while (counter <= power) {
            result *= number;
            counter++;
        }

        System.out.println("Result = " + result);
        input.close();
    }
}
