package ControlFlows.Level3;

import java.util.Scanner;

class P01_LeapYearMultiIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year >= 1582) {

            // Divisible by 400 means Leap Year
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            }
            // Divisible by 100 but not by 400 means NOT a Leap Year
            else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            }
            // Divisible by 4 but not by 100 means Leap Year
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            }
            // All other cases are not Leap Years
            else {
                System.out.println("Year is not a Leap Year");
            }
        } 
        else {
            System.out.println("Year should be greater than or equal to 1582");
        }

        input.close();
    }
}
