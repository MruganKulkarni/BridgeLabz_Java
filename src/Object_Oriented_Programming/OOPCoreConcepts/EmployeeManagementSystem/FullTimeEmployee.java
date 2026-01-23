package OOPCoreConcepts.EmployeeManagementSystem;
public class FullTimeEmployee extends Employee implements Department {

    // Department name
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
