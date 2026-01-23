package OOPCoreConcepts.ECommercePlatform;
public class Electronics extends Product implements Taxable {

    /*
     This class represents electronic products in the e-commerce system.
     It applies tax on electronics and demonstrates polymorphism
     by providing its own implementation of pricing logic.
    */

    // Tax rate for electronics
    private static final double TAX_RATE = 0.18;

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * TAX_RATE;
    }

    @Override
    public double calculateFinalPrice() {
        return price + calculateTax();
    }
}
