package Inheritance.IntroductionToInheritance.VehicleInheritance;
public class Car extends Vehicle {

    /*
     This class represents a Car which is a specific
     type of Vehicle. It inherits general vehicle
     behavior and adds car-specific functionality.
    */

    // Method specific to Car
    void fuelType() {
        System.out.println("Car uses petrol or diesel");
    }

    public static void main(String[] args) {
        // Creating Car object
        Car car = new Car();

        // Calling inherited method
        car.move();

        // Calling car-specific method
        car.fuelType();
    }
}
