package OOPCoreConcepts.ECommercePlatform;
public class ProductDemo {

    public static void main(String[] args) {

        // Polymorphic product references
        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Groceries(103, "Rice Bag", 1200);

        // Displaying product details
        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
    }
}
