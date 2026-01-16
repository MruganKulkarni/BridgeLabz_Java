class AgeFinder 
/*
 * Problem Statement:
 * Write a program to determine the age of Harry based on the birth year
 * and the current year. The program should calculate the difference
 * between the current year and the year of birth to find the age.
 *
 * This program demonstrates the use of variables, arithmetic operations,
 * and basic output statements in Java.
 */


{
    public static void main(String[] args) {

        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear; 
        //printing the age of harry
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
