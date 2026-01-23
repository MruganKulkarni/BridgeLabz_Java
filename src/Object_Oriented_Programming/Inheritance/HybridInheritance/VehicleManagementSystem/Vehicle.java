package Inheritance.HybridInheritance.VehicleManagementSystem;
public class Vehicle {

    /*
     This class represents a generic vehicle.
     It acts as the superclass and contains
     common attributes such as model and
     maximum speed.
    */

    // Stores vehicle model
    protected String model;

    // Stores maximum speed
    protected int maxSpeed;

    // Initializes vehicle details
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
