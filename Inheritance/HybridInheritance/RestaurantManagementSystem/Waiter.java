package Inheritance.HybridInheritance.RestaurantManagementSystem;
public class Waiter extends Person implements Worker {

    /*
     This class represents a waiter in the restaurant.
     It inherits common attributes from Person and
     implements the Worker interface to define
     waiter-specific responsibilities.
    */

    // Initializes waiter details
    public Waiter(String name, int id) {
        super(name, id); // Initialize base person details
    }

    // Performs waiter duties
    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}
