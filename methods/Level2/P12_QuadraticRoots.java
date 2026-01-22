package Methods.Level2;

import java.util.Scanner;

class P12_QuadraticRoots {

    public static double calculateDiscriminant(double a, double b, double c) {

        return (b * b) - (4 * a * c);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant > 0) {

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {

            double root = -b / (2 * a);
            System.out.println("Root is " + root);
        }
        else {
            System.out.println("No Real Roots");
        }

        input.close();
    }
}
