package Inheritance.HybridInheritance.RestaurantManagementSystem;
public class Person {

    /*
     This class represents a generic person in a restaurant system.
     It serves as the superclass and contains common attributes
     such as name and ID that are shared by all restaurant staff.
    */

    // Stores person name
    protected String name;

    // Stores person ID
    protected int id;

    // Initializes person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
