package Methods.Level3;
public class PrimeNumberMethods {

    /*
     * Problem Statement:
     * Check whether a given number is a prime number
     * using a separate method.
     */

    boolean isPrime(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Checks divisibility up to half of the number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumberMethods obj = new PrimeNumberMethods();

        int number = 29;
        System.out.println("Is Prime: " + obj.isPrime(number));
    }
}
