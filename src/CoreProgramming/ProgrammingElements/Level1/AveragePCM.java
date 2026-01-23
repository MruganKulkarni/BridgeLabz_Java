class AveragePCM 
/*
 * Problem Statement:
 * Write a program to calculate the average marks obtained in Physics,
 * Chemistry, and Mathematics. The program should store individual subject
 * marks, compute their sum, and calculate the average value.
 *
 * This program helps understand arithmetic operations and the concept
 * of averaging numerical values.
 */
{
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        // calculating the average marks
        double average = (maths + physics + chemistry) / 3.0;
        // printing the average marks of Sam in PCM
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
