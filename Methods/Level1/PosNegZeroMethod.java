package Methods.Level1;

import java.util.Scanner;

class P04_PosNegZeroMethod {

    public static String checkNumber(int number) {

        if (number > 0) {
            return "Positive";
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

        String result = checkNumber(number);
        System.out.println(result);

        input.close();
    }
}
