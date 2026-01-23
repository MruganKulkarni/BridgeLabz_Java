package Arrays.Level1;


import java.util.Scanner;

class P10_FizzBuzzArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Validate positive number
        if (number <= 0) {
            System.err.println("Invalid Number");
            input.close();
            return;
        }

        String[] results = new String[number + 1];

        for (int i = 1; i <= number; i++) {

            // Apply FizzBuzz conditions
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
