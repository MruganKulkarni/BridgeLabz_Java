package OOPCoreConcepts.VehicleRentalSystem;
public class Bike extends Vehicle {

    /*
     This class represents a bike available for rental.
     It extends the Vehicle class and applies a discounted
     rental rate compared to other vehicle types.
    */

    // Initializes bike details
    public Bike(int vehicleId, String brand, double ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    // Calculates rental cost for a bike
    @Override
    public double calculateRentalCost(int days) {
        return (ratePerDay * days) * 0.8;
    }
}
