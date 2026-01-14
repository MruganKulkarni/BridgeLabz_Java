package Methods.Level2;

import java.util.Scanner;

class P02_FactorsArrayOperations {

    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumFactors(int[] factors) {

        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int productFactors(int[] factors) {

        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double sumOfSquareFactors(int[] factors) {

        double sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Sum of Squares = " + sumOfSquareFactors(factors));

        input.close();
    }
}
