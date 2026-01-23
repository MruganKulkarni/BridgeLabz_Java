package Inheritance.HybridInheritance.RestaurantManagementSystem;
public class Chef extends Person implements Worker {

    /*
     This class represents a chef in the restaurant.
     It inherits common personal details from Person
     and implements the Worker interface to define
     chef-specific duties.
    */

    // Initializes chef details
    public Chef(String name, int id) {
        super(name, id); // Initialize base person details
    }

    // Performs chef duties
    @Override
    public void performDuties() {
        System.out.println("Chef is preparing meals.");
    }

    public static void main(String[] args) {
        // Creating Chef object
        Chef chef = new Chef("Rahul", 101);

        // Performing chef duties
        chef.performDuties();
    }
}
