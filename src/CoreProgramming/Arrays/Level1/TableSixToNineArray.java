package Arrays.Level1;

import java.util.Scanner;

class P05_TableSixToNineArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] multiplicationResult = new int[4];
        int index = 0;

        // Store multiplication results for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        input.close();
    }
}

