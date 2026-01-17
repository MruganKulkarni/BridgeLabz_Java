package JavaClassAndObject.Level1;
public class Employee {

    /*
     * This class represents an Employee in an organization. It stores basic
     * employee information such as name, employee ID, and salary. The class
     * provides a constructor to initialize these attributes and a method
     * to display the employee details in a readable format.
     */

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        // Displaying employee information
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101, 55000);
        emp.displayDetails();
    }
}
