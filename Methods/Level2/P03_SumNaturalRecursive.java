package Methods.Level2;

import java.util.Scanner;

class P03_SumNaturalRecursive {

    public static int sum(int number) {

        if (number == 0) {
            return 0;
        }

        return number + sum(number - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Sum = " + sum(number));
        } else {
            System.out.println("Invalid Number");
        }

        input.close();
    }
}
