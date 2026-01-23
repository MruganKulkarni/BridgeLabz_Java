package ConstructorsAndAccessModifiers.InstanceVsClassVariables;
public class StudentInstanceVariableDemo {

    /*
     This program demonstrates the use of instance variables.
     Each Student object maintains its own copy of instance variables,
     allowing different objects to store different values independently.
    */

    String name;
    int rollNumber;

    // Constructor initializes instance variables
    public StudentInstanceVariableDemo(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Displays student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        StudentInstanceVariableDemo s1 =
                new StudentInstanceVariableDemo("Arjun", 101);
        StudentInstanceVariableDemo s2 =
                new StudentInstanceVariableDemo("Meera", 102);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
