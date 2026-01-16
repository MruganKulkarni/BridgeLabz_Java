class PenDistribution
/*
 * Problem Statement:
 * Write a program to distribute a given number of pens equally among
 * a specified number of students. The program should calculate how many
 * pens each student receives and how many pens remain undistributed.
 *
 * This program demonstrates division and remainder operations.
 */
 {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        // printing the pen distribution details in one statement
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
