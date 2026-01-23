package Arrays.Level2;

import java.util.Scanner;

class P05_ReverseNumberArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number != 0) {

            // Store each digit
            digits[index++] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
