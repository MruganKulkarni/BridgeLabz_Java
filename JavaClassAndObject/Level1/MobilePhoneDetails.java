package JavaClassAndObject.Level1;

public class MobilePhoneDetails {

    /*
     * This class models a Mobile Phone by storing its brand, model,
     * and price. It provides a method to display all the phone
     * details clearly for each object created.
     */

    private String brand;
    private String model;
    private double price;

    public MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        // Displaying mobile phone information
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhoneDetails phone = new MobilePhoneDetails("Samsung", "Galaxy S23", 74999);
        phone.displayDetails();
    }
}
