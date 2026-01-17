package JavaClassAndObject.Level1;

public class Circle {

    /*
     * This class models a Circle using its radius. It provides methods
     * to calculate the area and circumference of the circle based on
     * standard mathematical formulas and displays the results.
     */

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        // Area formula: π * r * r
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        // Circumference formula: 2 * π * r
        return 2 * Math.PI * radius;
    }

    public void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.displayResults();
    }
}
