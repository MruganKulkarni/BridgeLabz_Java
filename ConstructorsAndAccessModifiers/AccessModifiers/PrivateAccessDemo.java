package ConstructorsAndAccessModifiers.AccessModifiers;
public class PrivateAccessDemo {

    /*
     This program explains the private access modifier.
     Private members are restricted to the same class, ensuring
     data hiding and preventing unauthorized access from outside.
    */

    // Private variable accessible only within this class
    private int secretCode = 1234;

    // Private method used internally
    private void showSecret() {
        System.out.println("Secret Code: " + secretCode);
    }

    public static void main(String[] args) {
        PrivateAccessDemo demo = new PrivateAccessDemo();
        // Accessing private method within the same class
        demo.showSecret();
    }
}
