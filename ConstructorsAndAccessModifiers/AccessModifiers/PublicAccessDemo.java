package ConstructorsAndAccessModifiers.AccessModifiers;
public class PublicAccessDemo {

    /*
     This program demonstrates the use of the public access modifier.
     Public members are accessible from anywhere in the program, making
     them suitable for methods or variables that must be openly available
     across different classes and packages.
    */

    // Public variable accessible everywhere
    public String message = "Public access granted";

    // Public method accessible everywhere
    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        PublicAccessDemo demo = new PublicAccessDemo();
        demo.displayMessage();
    }
}
