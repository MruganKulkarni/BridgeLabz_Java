package Arrays.Level2;

import java.util.Scanner;

class P08_StudentGradeArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] physics = new double[10];
        double[] chemistry = new double[10];
        double[] maths = new double[10];

        for (int i = 0; i < physics.length; i++) {

            physics[i] = input.nextDouble();
            chemistry[i] = input.nextDouble();
            maths[i] = input.nextDouble();
        }

        for (int i = 0; i < physics.length; i++) {

            double average = (physics[i] + chemistry[i] + maths[i]) / 3;

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
