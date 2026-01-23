package OOPCoreConcepts.EmployeeManagementSystem;
public interface Department {

    /*
     This interface defines department-related behavior
     that can be implemented by different employee types.
    */

    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
