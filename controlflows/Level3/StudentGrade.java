package ControlFlows.Level3;
import java.util.Scanner;

class P03_StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        // Calculate average of three subjects
        double average = (physics + chemistry + maths) / 3;

        if (average >= 90) {
            System.out.println("Average = " + average + " Grade = A Remark = Excellent");
        }
        else if (average >= 75) {
            System.out.println("Average = " + average + " Grade = B Remark = Very Good");
        }
        else if (average >= 60) {
            System.out.println("Average = " + average + " Grade = C Remark = Good");
        }
        else if (average >= 40) {
            System.out.println("Average = " + average + " Grade = D Remark = Pass");
        }
        else {
            System.out.println("Average = " + average + " Grade = F Remark = Fail");
        }

        input.close();
    }
}
