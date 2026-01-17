package OOPCoreConcepts.OnlineFoodDeliverySystem;

public abstract class FoodItem {

    /*
     This abstract class represents a generic food item in an online
     food delivery system. It encapsulates common attributes such as
     item name and base price, and enforces subclasses to define
     their own final price calculation logic.
    */

    // Name of the food item
    private String itemName;

    // Base price of the food item
    protected double basePrice;

    public FoodItem(String itemName, double basePrice) {
        this.itemName = itemName;
        this.basePrice = basePrice;
    }

    // Getter for item name
    public String getItemName() {
        return itemName;
    }

    // Abstract method to calculate final price
    public abstract double calculatePrice();

    // Displays food item details
    public void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Final Price: " + calculatePrice());
    }
}
