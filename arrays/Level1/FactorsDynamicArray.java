package Arrays.Level1;

import java.util.Scanner;

class P08_FactorsDynamicArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            // Store i if it perfectly divides number
            if (number % i == 0) {

                // Expand array size if limit reached
                if (index == maxSize) {

                    maxSize = maxSize * 2;
                    int[] temp = new int[maxSize];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }

        input.close();
    }
}
