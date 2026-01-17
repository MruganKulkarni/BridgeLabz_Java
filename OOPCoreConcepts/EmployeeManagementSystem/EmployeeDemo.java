package OOPCoreConcepts.EmployeeManagementSystem;
public class EmployeeDemo {

    public static void main(String[] args) {

        // Polymorphic employee references
        Employee e1 = new FullTimeEmployee(1, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(2, "Riya", 500, 40);

        // Display employee details
        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
    }
}
