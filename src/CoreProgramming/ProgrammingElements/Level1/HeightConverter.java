import java.util.Scanner;

class HeightConverter 
/*
 * Problem Statement:
 * Write a program to convert a given height from centimeters to feet
 * and inches. The program should apply appropriate conversion logic
 * to display the height in a readable format.
 *
 * This program illustrates unit conversion and arithmetic calculations.
 */
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}
