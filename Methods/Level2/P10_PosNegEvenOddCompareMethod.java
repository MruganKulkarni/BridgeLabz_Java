package Methods.Level2;

import java.util.Scanner;

class P10_PosNegEvenOddCompareMethod {

    public static String classifyNumber(int number) {

        if (number > 0 && number % 2 == 0) {
            return "Positive and Even";
        }
        else if (number > 0) {
            return "Positive and Odd";
        }
        else if (number < 0) {
            return "Negative";
        }
        else {
            return "Zero";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(classifyNumber(number));
        input.close();
    }
}
