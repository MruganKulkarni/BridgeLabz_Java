package Strings.Level3;
import java.util.Scanner;

public class BMICalculator2D {

    /*
     * This program calculates the Body Mass Index (BMI) for multiple persons.
     * It stores height, weight, BMI value, and BMI category in a 2D array.
     * The program demonstrates array manipulation, BMI calculation,
     * and conditional classification logic.
     */

    double calculateBMI(double weight, double height) {
        // BMI formula: weight / (height * height)
        return weight / (height * height);
    }

    String classifyBMI(double bmi) {
        // Classify BMI based on standard ranges
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator2D obj = new BMICalculator2D();

        String[][] data = new String[5][4];

        for (int i = 0; i < data.length; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            double bmi = obj.calculateBMI(weight, height);

            data[i][0] = String.valueOf(weight);
            data[i][1] = String.valueOf(height);
            data[i][2] = String.format("%.2f", bmi);
            data[i][3] = obj.classifyBMI(bmi);
        }

        for (String[] row : data) {
            System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
        }
    }
}
