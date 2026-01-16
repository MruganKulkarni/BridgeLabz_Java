package Arrays.Level1;

import java.util.Scanner;

class P04_StoreUntilZeroArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            double number = input.nextDouble();

            // Stop storing when number is 0 or negative
            if (number <= 0) {
                break;
            }

            // Stop storing when array limit reaches
            if (index == values.length) {
                break;
            }

            values[index] = number;
            index++;
        }

        // Sum all stored values
        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("Total = " + total);
        input.close();
    }
}

