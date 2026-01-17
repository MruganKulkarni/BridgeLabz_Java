package Methods.Level3;

public class SumOfDigits {

    /*
     * Problem Statement:
     * Generate a random 4-digit number and find the sum of its digits.
     * The program should count the digits, extract them, store them
     * in an array, and compute their sum using methods.
     */

    int generateNumber() {
        return (int) (Math.random() * 9000) + 1000;
    }

    int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;   // extract last digit
            number /= 10;         // remove last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();

        int number = obj.generateNumber();
        int sum = obj.sumDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}
