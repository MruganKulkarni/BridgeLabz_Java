package OOPCoreConcepts.RideHailingApplication;
public class Auto extends Vehicle {

    /*
     This class represents an auto-rickshaw in the ride-hailing system.
     It provides moderate pricing between bikes and cars.
    */

    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10);
    }

    // Calculates fare for auto ride
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
