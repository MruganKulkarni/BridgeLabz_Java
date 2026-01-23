package OOPCoreConcepts.VehicleRentalSystem;
public class Car extends Vehicle {

    /*
     This class represents a car available for rental.
     It extends the Vehicle class and applies car-specific
     pricing logic when calculating rental cost.
    */

    // Initializes car details
    public Car(int vehicleId, String brand, double ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    // Calculates rental cost for a car
    @Override
    public double calculateRentalCost(int days) {
        return ratePerDay * days;
    }
}
