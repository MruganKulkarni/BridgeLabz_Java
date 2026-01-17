package OOPCoreConcepts.VehicleRentalSystem;
public abstract class Vehicle {

    /*
     This abstract class represents a generic vehicle available for rental.
     It encapsulates common vehicle attributes such as vehicle ID and brand,
     and defines an abstract method for calculating rental cost that must
     be implemented by specific vehicle types.
    */

    // Unique vehicle ID
    private int vehicleId;

    // Vehicle brand name
    private String brand;

    // Base rental rate per day
    protected double ratePerDay;

    public Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    // Getter for vehicle ID
    public int getVehicleId() {
        return vehicleId;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Displays common vehicle details
    public void displayVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
    }
}
