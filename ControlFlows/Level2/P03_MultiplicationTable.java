package ControlFlows.Level2;

import java.util.Scanner;

class P03_MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // multiplication table fro 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
