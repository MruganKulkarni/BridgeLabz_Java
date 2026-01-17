package Inheritance.HybridInheritance.VehicleManagementSystem;
public class ElectricVehicle extends Vehicle {

    /*
     This class represents an electric vehicle.
     It extends the Vehicle class and provides
     charging functionality instead of refueling.
    */

    // Initializes electric vehicle details
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed); // Initialize base vehicle details
    }

    // Charges the electric vehicle
    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}
