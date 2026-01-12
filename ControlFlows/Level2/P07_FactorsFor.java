package ControlFlows.Level2;

import java.util.Scanner;

class P07_FactorsFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            for (int i = 1; i < number; i++) {

                // Print i if it perfectly divides the number
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
