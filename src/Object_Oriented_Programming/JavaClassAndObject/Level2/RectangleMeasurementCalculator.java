package JavaClassAndObject.Level2;

public class RectangleMeasurementCalculator {

    /*
     * This class models a Rectangle using length and breadth.
     * It provides methods to calculate area and perimeter
     * and demonstrates encapsulation and method usage.
     */

    private double length;
    private double breadth;

    public RectangleMeasurementCalculator(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        // Area formula: length * breadth
        return length * breadth;
    }

    public double calculatePerimeter() {
        // Perimeter formula: 2 * (length + breadth)
        return 2 * (length + breadth);
    }
        // Display
    public void displayResults() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        RectangleMeasurementCalculator rectangle = new RectangleMeasurementCalculator(10, 5);
        rectangle.displayResults();
    }
}
