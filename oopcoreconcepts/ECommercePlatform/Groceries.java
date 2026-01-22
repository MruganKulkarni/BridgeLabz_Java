package OOPCoreConcepts.ECommercePlatform;
public class Groceries extends Product {

    /*
     This class represents grocery items in the e-commerce platform.
     It does not apply tax or discounts, demonstrating a simple pricing model.
    */

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateFinalPrice() {
        return price;
    }
}
