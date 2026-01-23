import java.util.Scanner;

class SquareSideFinder 

/*
 * Problem Statement:
 * Write a program to determine the side length of a square when its
 * perimeter is given. The program should use the relationship between
 * the perimeter and the side length of a square.
 *
 * This program demonstrates algebraic reasoning and arithmetic operations.
 */
{
    public static void main(String[] args) {
        System.out.println("Enter the perimeter of square");
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is\s"+ side +  "\swhose perimeter is "+ perimeter );



        }
}