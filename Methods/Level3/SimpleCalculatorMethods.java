package Methods.Level3;
public class SimpleCalculatorMethods {

    /*
     * Problem Statement:
     * Perform basic arithmetic operations such as addition,
     * subtraction, multiplication, and division using methods.
     */

    int add(int a, int b) {
        // Returns sum of two numbers
        return a + b;
    }

    int subtract(int a, int b) {
        // Returns difference of two numbers
        return a - b;
    }

    int multiply(int a, int b) {
        // Returns product of two numbers
        return a * b;
    }

    double divide(int a, int b) {
        // Performs division after type casting
        return (double) a / b;
    }

    public static void main(String[] args) {
        SimpleCalculatorMethods obj = new SimpleCalculatorMethods();

        System.out.println("Add: " + obj.add(10, 5));
        System.out.println("Subtract: " + obj.subtract(10, 5));
        System.out.println("Multiply: " + obj.multiply(10, 5));
        System.out.println("Divide: " + obj.divide(10, 5));
    }
}
