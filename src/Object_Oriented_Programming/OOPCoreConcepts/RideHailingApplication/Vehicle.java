package OOPCoreConcepts.RideHailingApplication;
public abstract class Vehicle implements GPS {

    /*
     This abstract class represents a generic vehicle in a ride-hailing
     application. It encapsulates vehicle and driver details while
     enforcing subclasses to define fare calculation logic. Common
     functionality like displaying vehicle details is shared across
     all vehicle types.
    */

    // Unique vehicle identifier
    private String vehicleId;

    // Name of the driver
    private String driverName;

    // Rate charged per kilometer
    protected double ratePerKm;

    // Current GPS location
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Displays vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Returns current GPS location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Updates GPS location
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
