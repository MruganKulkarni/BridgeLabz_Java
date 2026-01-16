import java.util.Scanner;

class TotalPurchasePrice 

/*
 * Problem Statement:
 * Write a program to calculate the total purchase price of items,
 * including tax. The program should compute the tax amount based on
 * a given percentage and add it to the base price.
 *
 * This program focuses on percentage calculations and total cost computation.
 */
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Unit Price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();
        // calculating the total price
        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
