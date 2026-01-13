package Arrays.Level1;

import java.util.Scanner;

class P07_OddEvenArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // Natural number validation
        if (number <= 0) {
            System.err.println("Invalid Number");
            input.close();
            return;
        }

        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {

            // Store number based on odd or even condition
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        for (int i = 0; i < oddIndex; i++) {
            System.out.println("Odd: " + oddNumbers[i]);
        }

        for (int i = 0; i < evenIndex; i++) {
            System.out.println("Even: " + evenNumbers[i]);
        }

        input.close();
    }
}
