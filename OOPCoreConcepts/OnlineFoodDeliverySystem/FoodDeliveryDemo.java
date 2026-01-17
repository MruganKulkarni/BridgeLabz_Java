package OOPCoreConcepts.OnlineFoodDeliverySystem;
public class FoodDeliveryDemo {

    public static void main(String[] args) {

        // Polymorphic food item references
        FoodItem vegFood =
                new VegetarianFood("Paneer Butter Masala", 250);

        FoodItem nonVegFood =
                new NonVegetarianFood("Chicken Biryani", 300);

        // Displaying vegetarian food details
        vegFood.displayItem();
        ((Deliverable) vegFood).deliver();
        System.out.println();

        // Displaying non-vegetarian food details
        nonVegFood.displayItem();
        ((Deliverable) nonVegFood).deliver();
    }
}
