package Inheritance.HybridInheritance.VehicleManagementSystem;
public class PetrolVehicle extends Vehicle implements Refuelable {

    /*
     This class represents a petrol vehicle.
     It extends the Vehicle class and implements
     the Refuelable interface to support refueling,
     demonstrating hybrid inheritance.
    */

    // Initializes petrol vehicle details
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed); // Initialize base vehicle details
    }

    // Refuels the petrol vehicle
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }

    public static void main(String[] args) {
        // Creating PetrolVehicle object
        PetrolVehicle vehicle =
                new PetrolVehicle("Honda City", 180);

        // Refueling the vehicle
        vehicle.refuel();
    }
}
