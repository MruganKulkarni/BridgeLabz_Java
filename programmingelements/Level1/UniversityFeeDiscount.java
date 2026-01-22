class DiscountCalculator
/*
 * Problem Statement:
 * Write a program to calculate the discounted university fee based on
 * the original fee amount and a given discount percentage. The program
 * should compute the discount value and the final payable fee.
 *
 * This program focuses on percentage calculations and arithmetic logic.
 */
 {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        // printing the discount amount and final discounted fee
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
