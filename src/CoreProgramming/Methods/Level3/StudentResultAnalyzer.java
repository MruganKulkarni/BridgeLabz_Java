package Methods.Level3;
public class StudentResultAnalyzer {

    /*
     * Problem Statement:
     * Analyze student marks to calculate total, average,
     * and determine pass or fail using methods.
     */

    int calculateTotal(int[] marks) {
        int total = 0;

        // Adds all subject marks
        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage(int total, int subjectCount) {
        // Calculates average marks
        return (double) total / subjectCount;
    }

    boolean checkPass(int[] marks) {

        // Checks if any subject mark is below passing criteria
        for (int mark : marks) {
            if (mark < 35) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        StudentResultAnalyzer obj = new StudentResultAnalyzer();

        int[] marks = {65, 72, 58, 81};

        int total = obj.calculateTotal(marks);
        double average = obj.calculateAverage(total, marks.length);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + (obj.checkPass(marks) ? "Pass" : "Fail"));
    }
}
