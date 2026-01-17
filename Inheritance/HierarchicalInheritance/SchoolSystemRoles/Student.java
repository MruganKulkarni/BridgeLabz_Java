package Inheritance.HierarchicalInheritance.SchoolSystemRoles;
public class Student extends Person {

    /*
     This class represents a student in a school system.
     It extends the Person class by adding academic-specific
     information such as grade.
    */

    // Stores student grade
    private String grade;

    // Initializes student details
    public Student(String name, int age, String grade) {
        super(name, age); // Initialize base person details
        this.grade = grade;
    }

    // Displays student role
    void displayRole() {
        System.out.println("Role: Student");
    }
}
