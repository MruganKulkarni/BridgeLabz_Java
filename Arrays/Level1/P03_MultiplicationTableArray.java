package Arrays.Level1;

import java.util.Scanner;

class P03_MultiplicationTableArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] table = new int[10];

        // multiplication table using for loop
        for (int i = 1; i <= 10; i++) {

            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
