package ControlFlows.Level2;

import java.util.Scanner;

class P05_FizzBuzzWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int counter = 1;

        // Loop till the entered number
        while (counter <= number) {

            // Check for multiple of both 3 and 5
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for multiple of 3
            else if (counter % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for multiple of 5
            else if (counter % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if no condition matches
            else {
                System.out.println(counter);
            }

            counter++;
        }

        input.close();
    }
}
