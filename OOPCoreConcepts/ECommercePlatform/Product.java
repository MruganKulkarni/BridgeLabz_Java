package OOPCoreConcepts.ECommercePlatform;
public abstract class Product {

    /*
     This abstract class represents a generic product in an e-commerce platform.
     It encapsulates common product attributes such as product ID, name, and price,
     and enforces subclasses to implement their own pricing logic.
    */

    // Unique product ID
    private int productId;

    // Product name
    private String productName;

    // Base price of the product
    protected double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter methods for encapsulated fields
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    // Abstract method for final price calculation
    public abstract double calculateFinalPrice();

    // Displays common product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
