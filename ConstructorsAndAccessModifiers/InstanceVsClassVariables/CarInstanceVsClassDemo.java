package ConstructorsAndAccessModifiers.InstanceVsClassVariables;
public class CarInstanceVsClassDemo {

    /*
     This program demonstrates the difference between instance and
     static variables using a car example. The brand is common to
     all cars, while the model is specific to each object.
    */

    static String brand = "Toyota";
    String model;

    // Constructor initializes model
    public CarInstanceVsClassDemo(String model) {
        this.model = model;
    }

    // Displays car details
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        CarInstanceVsClassDemo car1 =
                new CarInstanceVsClassDemo("Corolla");
        CarInstanceVsClassDemo car2 =
                new CarInstanceVsClassDemo("Camry");

        car1.displayCarInfo();
        System.out.println();
        car2.displayCarInfo();
    }
}
