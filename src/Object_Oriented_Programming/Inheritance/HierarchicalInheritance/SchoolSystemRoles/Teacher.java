package Inheritance.HierarchicalInheritance.SchoolSystemRoles;
public class Teacher extends Person {

    /*
     This class represents a teacher in a school system.
     It extends the Person class by adding teaching-specific
     information such as subject specialization.
    */

    // Stores subject taught
    private String subject;

    // Initializes teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age); // Initialize base person details
        this.subject = subject;
    }

    // Displays teacher role
    void displayRole() {
        System.out.println("Role: Teacher");
    }
}
