package JavaClassAndObject.Level1;

public class ItemBillingDetails {

    /*
     * This class represents an inventory item. It stores item code,
     * item name, and price. The class provides functionality to
     * display item details and calculate the total cost based on
     * a given quantity.
     */

    private int itemCode;
    private String itemName;
    private double price;

    public ItemBillingDetails(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        // Calculating total cost using quantity
        return price * quantity;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        ItemBillingDetails item = new ItemBillingDetails(501, "Keyboard", 1500);
        item.displayDetails(3);
    }
}
