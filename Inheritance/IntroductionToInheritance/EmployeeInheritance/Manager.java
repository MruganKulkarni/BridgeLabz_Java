package Inheritance.IntroductionToInheritance.EmployeeInheritance;
public class Manager extends Employee {

    /*
     This class represents a Manager who is a type of Employee.
     It extends the Employee class and adds additional
     managerial responsibility information.
    */

    // Stores department name
    String department;

    // Initializes manager details using super keyword
    public Manager(String name, double salary, String department) {
        super(name, salary); // Initialize parent class fields
        this.department = department;
    }

    // Displays manager details
    void displayManagerDetails() {
        displayDetails(); // Call parent method
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating Manager object
        Manager manager =
                new Manager("Rohit", 75000, "IT");

        // Displaying manager details
        manager.displayManagerDetails();
    }
}
