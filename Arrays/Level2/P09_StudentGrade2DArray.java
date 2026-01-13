package Arrays.Level2;

import java.util.Scanner;

class P09_StudentGrade2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] marks = new double[10][3];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < marks.length; i++) {

            double average = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (average >= 90) {
                System.out.println("Grade A");
            }
            else if (average >= 75) {
                System.out.println("Grade B");
            }
            else if (average >= 60) {
                System.out.println("Grade C");
            }
            else if (average >= 40) {
                System.out.println("Grade D");
            }
            else {
                System.out.println("Grade F");
            }
        }

        input.close();
    }
}
