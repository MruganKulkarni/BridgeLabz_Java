package Methods.Level2;

import java.util.Scanner;

class P11_BMI2DMethod {

    public static double calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;
        return weight / (heightMeter * heightMeter);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] people = new double[10][2];

        for (int i = 0; i < people.length; i++) {
            people[i][0] = input.nextDouble();
            people[i][1] = input.nextDouble();
        }

        for (int i = 0; i < people.length; i++) {

            double bmi = calculateBMI(people[i][0], people[i][1]);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            }
            else if (bmi < 24.9) {
                System.out.println("Normal");
            }
            else if (bmi < 29.9) {
                System.out.println("Overweight");
            }
            else {
                System.out.println("Obese");
            }
        }

        input.close();
    }
}
