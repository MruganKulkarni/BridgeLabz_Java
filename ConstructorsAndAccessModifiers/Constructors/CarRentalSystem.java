package ConstructorsAndAccessModifiers.Constructors;
public class CarRentalSystem {

    /*
     This program models a car rental system using constructors to initialize
     rental details and calculate total rental cost based on the number of days.
     It keeps the logic simple and constructor-focused.
    */

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500.0;

    // Parameterized constructor
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculates total rental cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Displays rental details
    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRentalSystem rental =
                new CarRentalSystem("Rahul", "Sedan", 4);

        rental.displayRentalDetails();
    }
}
