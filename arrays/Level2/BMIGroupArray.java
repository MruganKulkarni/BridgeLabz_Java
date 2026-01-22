package Arrays.Level2;

import java.util.Scanner;

class P06_BMIGroupArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] weight = new double[10];
        double[] height = new double[10];
        double[] bmi = new double[10];

        for (int i = 0; i < bmi.length; i++) {

            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            // Convert height to meters
            double heightMeter = height[i] / 100;

            // Calculate BMI
            bmi[i] = weight[i] / (heightMeter * heightMeter);
        }

        for (int i = 0; i < bmi.length; i++) {

            if (bmi[i] < 18.5) {
                System.out.println("Underweight");
            }
            else if (bmi[i] < 24.9) {
                System.out.println("Normal");
            }
            else if (bmi[i] < 29.9) {
                System.out.println("Overweight");
            }
            else {
                System.out.println("Obese");
            }
        }

        input.close();
    }
}
