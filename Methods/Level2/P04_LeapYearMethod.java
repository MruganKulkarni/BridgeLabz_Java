package Methods.Level2;

import java.util.Scanner;

class P04_LeapYearMethod {

    public static boolean isLeapYear(int year) {

        boolean isLeap =
                (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);

        return isLeap;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year >= 1582 && isLeapYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}
