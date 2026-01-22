package Strings.Level2;
import java.util.Scanner;

public class StudentGradeCalculator {

    /*
     * Problem Statement:
     * Accept student marks and calculate grade based on
     * average marks using conditional statements.
     */

    double calculateAverage(int[] marks) {
        int sum = 0;

        // Adds all marks
        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    String determineGrade(double average) {

        // Determines grade based on average score
        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeCalculator obj = new StudentGradeCalculator();

        int[] marks = new int[3];

        // Reads marks for three subjects
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        double average = obj.calculateAverage(marks);
        String grade = obj.determineGrade(average);

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
