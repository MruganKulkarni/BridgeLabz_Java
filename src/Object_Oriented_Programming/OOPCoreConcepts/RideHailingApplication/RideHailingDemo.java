package OOPCoreConcepts.RideHailingApplication;
public class RideHailingDemo {

    // Calculates and displays fare using polymorphism
    public static void calculateRideFare(Vehicle vehicle, double distance) {

        // Display vehicle information
        vehicle.getVehicleDetails();

        // Calculate fare dynamically based on vehicle type
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating different vehicle types
        Vehicle car = new Car("CAR101", "Ramesh");
        Vehicle bike = new Bike("BIKE202", "Suresh");
        Vehicle auto = new Auto("AUTO303", "Mahesh");

        // Updating GPS locations
        car.updateLocation("MG Road");
        bike.updateLocation("BTM Layout");
        auto.updateLocation("Indiranagar");

        // Calculating fares using polymorphism
        calculateRideFare(car, 12);
        calculateRideFare(bike, 5);
        calculateRideFare(auto, 8);
    }
}
