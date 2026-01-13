package Arrays.Level2;

import java.util.Scanner;

class P07_BMIGroup2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] people = new double[10][2];
        double[] bmi = new double[10];

        for (int i = 0; i < people.length; i++) {

            people[i][0] = input.nextDouble(); // weight
            people[i][1] = input.nextDouble(); // height in cm

            double heightMeter = people[i][1] / 100;
            bmi[i] = people[i][0] / (heightMeter * heightMeter);
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
