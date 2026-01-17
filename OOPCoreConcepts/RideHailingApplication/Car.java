package OOPCoreConcepts.RideHailingApplication;
public class Car extends Vehicle {

    /*
     This class represents a car used in the ride-hailing application.
     It calculates fare based on a higher rate suitable for car rides.
    */

    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 15);
    }

    // Calculates fare for car ride
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
