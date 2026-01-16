package ControlFlows.Level3;

import java.util.Scanner;

class P02_LeapYearSingleIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // Logical expression that returns true only for valid leap years
        boolean isLeap = year >= 1582 &&
                        ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

        if (isLeap) {
            System.out.println("Year is a Leap Year");
        } 
        else {
            System.out.println("Year is not a Leap Year");
        }

        input.close();
    }
}
