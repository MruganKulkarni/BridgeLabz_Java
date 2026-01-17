package Inheritance.MultilevelInheritance.EducationalCourseHierarchy;
public class Course {

    /*
     This class represents a general educational course.
     It serves as the base class and contains fundamental
     course details such as course name and duration.
    */

    // Stores course name
    protected String courseName;

    // Stores course duration
    protected int duration;

    // Initializes course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Displays course information
    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
