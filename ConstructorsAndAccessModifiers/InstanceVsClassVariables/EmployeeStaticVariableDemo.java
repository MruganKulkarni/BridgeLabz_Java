package ConstructorsAndAccessModifiers.InstanceVsClassVariables;
public class EmployeeStaticVariableDemo {

    /*
     This program illustrates the use of a static class variable.
     A static variable is shared across all objects of a class,
     making it suitable for data common to all instances.
    */

    static String companyName = "BridgeLabz";
    String employeeName;

    // Constructor initializes employee-specific data
    public EmployeeStaticVariableDemo(String employeeName) {
        this.employeeName = employeeName;
    }

    // Displays employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        EmployeeStaticVariableDemo e1 =
                new EmployeeStaticVariableDemo("Rohit");
        EmployeeStaticVariableDemo e2 =
                new EmployeeStaticVariableDemo("Sneha");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}
