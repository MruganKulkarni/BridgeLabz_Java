package Inheritance.HierarchicalInheritance.SchoolSystemRoles;
public class Staff extends Person {

    /*
     This class represents a staff member in a school system.
     It extends the Person class by adding job-specific
     information such as department.
    */

    // Stores staff department
    private String department;

    // Initializes staff details
    public Staff(String name, int age, String department) {
        super(name, age); // Initialize base person details
        this.department = department;
    }

    // Displays staff role
    void displayRole() {
        System.out.println("Role: Staff");
    }
}
