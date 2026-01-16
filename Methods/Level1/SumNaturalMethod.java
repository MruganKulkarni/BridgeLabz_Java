package Methods.Level1;

import java.util.Scanner;

class P06_SumNaturalMethod {

    public static int calculateSum(int number) {

        int sum = number * (number + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {

            int result = calculateSum(number);
            System.out.println("Sum = " + result);
        } 
        else {
            System.out.println("Invalid Number");
        }

        input.close();
    }
}
