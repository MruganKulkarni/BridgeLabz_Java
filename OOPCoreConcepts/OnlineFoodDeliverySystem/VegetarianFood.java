package OOPCoreConcepts.OnlineFoodDeliverySystem;
public class VegetarianFood extends FoodItem implements Deliverable {

    /*
     This class represents a vegetarian food item.
     It extends FoodItem and implements Deliverable
     to provide pricing and delivery behavior.
    */

    // Initializes vegetarian food item
    public VegetarianFood(String itemName, double basePrice) {
        super(itemName, basePrice);
    }

    // Calculates final price for vegetarian food
    @Override
    public double calculatePrice() {
        return basePrice + 50;
    }

    // Delivery instruction
    @Override
    public void deliver() {
        System.out.println("Delivering vegetarian food safely.");
    }
}
