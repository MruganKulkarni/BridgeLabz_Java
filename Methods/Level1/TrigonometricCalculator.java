package Methods.Level1;

import java.util.Scanner;

class P11_TrigonometricCalculator {

    public static double calculateSin(double angle) {

        double radian = Math.toRadians(angle);
        return Math.sin(radian);
    }

    public static double calculateCos(double angle) {

        double radian = Math.toRadians(angle);
        return Math.cos(radian);
    }

    public static double calculateTan(double angle) {

        double radian = Math.toRadians(angle);
        return Math.tan(radian);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double angle = input.nextDouble();

        System.out.println("Sin = " + calculateSin(angle));
        System.out.println("Cos = " + calculateCos(angle));
        System.out.println("Tan = " + calculateTan(angle));

        input.close();
    }
}
