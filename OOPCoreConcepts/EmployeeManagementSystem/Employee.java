package OOPCoreConcepts.EmployeeManagementSystem;
public abstract class Employee {

    /*
     This abstract class represents a generic employee in the organization.
     It defines common properties such as employee ID, name, and base salary,
     and enforces salary calculation logic through an abstract method.
    */

    // Employee ID
    private int employeeId;

    // Employee name
    private String name;

    // Base salary
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract salary calculation
    public abstract double calculateSalary();

    // Displays employee details
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
