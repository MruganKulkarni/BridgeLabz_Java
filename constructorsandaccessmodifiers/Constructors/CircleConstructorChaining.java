package ConstructorsAndAccessModifiers.Constructors;
public class CircleConstructorChaining {

    /*
     This program illustrates constructor chaining where one constructor
     calls another using the this() keyword. It helps reduce duplication
     and ensures consistent initialization of object state.
    */

    double radius;

    // Default constructor calls parameterized constructor
    public CircleConstructorChaining() {
        this(1.0); // default radius
    }

    // Parameterized constructor
    public CircleConstructorChaining(double radius) {
        this.radius = radius;
    }

    // Calculates area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleConstructorChaining defaultCircle = new CircleConstructorChaining();
        CircleConstructorChaining customCircle = new CircleConstructorChaining(5.5);

        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
    }
}
