package Inheritance.IntroductionToInheritance.EmployeeInheritance;
public class Employee {

    /*
     This class represents a generic Employee.
     It stores common employee details that can be
     inherited by specialized employee roles.
    */

    // Stores employee name
    String name;

    // Stores employee salary
    double salary;

    // Initializes employee details
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Displays employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
