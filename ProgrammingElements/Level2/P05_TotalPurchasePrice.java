import java.util.Scanner;

class P05_TotalPurchasePrice {
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
