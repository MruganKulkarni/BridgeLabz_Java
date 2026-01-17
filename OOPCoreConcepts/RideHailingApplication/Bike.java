package OOPCoreConcepts.RideHailingApplication;
public class Bike extends Vehicle {

    /*
     This class represents a bike used in the ride-hailing application.
     It offers a lower fare compared to cars, suitable for short trips.
    */

    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 8);
    }

    // Calculates fare for bike ride
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
