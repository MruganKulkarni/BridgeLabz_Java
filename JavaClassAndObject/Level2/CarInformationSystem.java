package JavaClassAndObject.Level2;

public class CarInformationSystem {

    /*
     * This class represents a Car with attributes such as brand,
     * model, and price. It demonstrates object creation and
     * method-based interaction to display car information.
     */

    private String brand;
    private String model;
    private double price;

    public CarInformationSystem(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarDetails() {
        // Printing car details
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        CarInformationSystem car = new CarInformationSystem("Honda", "City", 1200000);
        car.displayCarDetails();
    }
}
