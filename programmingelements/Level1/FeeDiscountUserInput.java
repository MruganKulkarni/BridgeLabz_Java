import java.util.Scanner;

class FeeDiscountUserInput 
/*
 * Problem Statement:
 * Write a program to calculate the discounted fee amount by taking
 * the original fee and discount percentage as user input. The program
 * should compute and display the final payable fee.
 *
 * This program demonstrates user input handling and arithmetic operations.
 */
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
