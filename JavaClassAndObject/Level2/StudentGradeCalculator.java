package JavaClassAndObject.Level2;

public class StudentGradeCalculator {

    /*
     * This class represents a Student with attributes such as name,
     * roll number, and marks. It provides functionality to calculate
     * the grade based on marks and display the complete student details.
     * The program demonstrates object creation and behavior through methods.
     */

    private String name;
    private int rollNumber;
    private int marks;

    public StudentGradeCalculator(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        // Determining grade based on marks
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else return 'D';
    }
    // Display
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentGradeCalculator student = new StudentGradeCalculator("Amit", 12, 82);
        student.displayDetails();
    }
}
