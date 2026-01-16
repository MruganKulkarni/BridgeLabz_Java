package ControlFlows.Level3;

import java.util.Scanner;

class P07_BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI using formula
        double bmi = weight / (heightMeter * heightMeter);

        if (bmi < 18.5) {
            System.out.println("BMI = " + bmi + " Status = Underweight");
        }
        else if (bmi < 24.9) {
            System.out.println("BMI = " + bmi + " Status = Normal");
        }
        else if (bmi < 29.9) {
            System.out.println("BMI = " + bmi + " Status = Overweight");
        }
        else {
            System.out.println("BMI = " + bmi + " Status = Obese");
        }

        input.close();
    }
}
