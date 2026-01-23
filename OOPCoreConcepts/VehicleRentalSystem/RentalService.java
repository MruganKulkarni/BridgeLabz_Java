package OOPCoreConcepts.VehicleRentalSystem;
public class RentalService {

    public static void main(String[] args) {

        // Polymorphic vehicle references
        Vehicle car = new Car(201, "Toyota", 2000);
        Vehicle bike = new Bike(202, "Yamaha", 800);

        // Displaying car rental details
        car.displayVehicleDetails();
        System.out.println("Rental Cost (3 days): " + car.calculateRentalCost(3));
        System.out.println();

        // Displaying bike rental details
        bike.displayVehicleDetails();
        System.out.println("Rental Cost (3 days): " + bike.calculateRentalCost(3));
    }
}
