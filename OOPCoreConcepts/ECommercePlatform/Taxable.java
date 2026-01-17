package OOPCoreConcepts.ECommercePlatform;
public interface Taxable {

    /*
     This interface represents tax-related behavior for products.
     It ensures that implementing classes provide a method to
     calculate tax based on product-specific rules.
    */

    double calculateTax();
}
