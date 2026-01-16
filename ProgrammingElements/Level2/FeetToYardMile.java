import java.util.Scanner;

class FeetToYardMile

/*
 * Problem Statement:
 * Write a program to convert a given distance in feet into yards and miles.
 * The program should apply appropriate conversion factors to display
 * the equivalent distances.
 *
 * This program demonstrates unit conversion using arithmetic calculations.
 */
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in Feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

    }
}
