package OOPCoreConcepts.ECommercePlatform;
public class Clothing extends Product {

    /*
     This class represents clothing items in the e-commerce platform.
     It applies a flat discount on the base price to compute the final cost.
    */

    // Flat discount amount
    private static final double DISCOUNT = 200;

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateFinalPrice() {
        return price - DISCOUNT;
    }
}
