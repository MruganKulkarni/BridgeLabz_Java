package ConstructorsAndAccessModifiers.AccessModifiers;
public class ProtectedAccessDemo {

    /*
     This program demonstrates the protected access modifier.
     Protected members can be accessed within the same package
     or through inheritance in subclasses from other packages.
    */

    // Protected variable
    protected String protectedMessage = "Protected access active";

    // Protected method
    protected void displayProtectedMessage() {
        System.out.println(protectedMessage);
    }

    public static void main(String[] args) {
        ProtectedAccessDemo demo = new ProtectedAccessDemo();
        demo.displayProtectedMessage();
    }
}
