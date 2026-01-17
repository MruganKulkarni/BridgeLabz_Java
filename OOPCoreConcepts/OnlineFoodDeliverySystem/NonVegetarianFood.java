package OOPCoreConcepts.OnlineFoodDeliverySystem;
public class NonVegetarianFood extends FoodItem implements Deliverable {

    /*
     This class represents a non-vegetarian food item.
     It extends FoodItem and implements Deliverable
     with different pricing and delivery rules.
    */

    // Initializes non-vegetarian food item
    public NonVegetarianFood(String itemName, double basePrice) {
        super(itemName, basePrice);
    }

    // Calculates final price for non-vegetarian food
    @Override
    public double calculatePrice() {
        return basePrice + 100;
    }

    // Delivery instruction
    @Override
    public void deliver() {
        System.out.println("Delivering non-vegetarian food with care.");
    }
}
