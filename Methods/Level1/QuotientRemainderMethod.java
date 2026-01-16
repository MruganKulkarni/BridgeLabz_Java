package Methods.Level1;

import java.util.Scanner;

class P08_QuotientRemainderMethod {

    public static int findQuotient(int dividend, int divisor) {

        return dividend / divisor;
    }

    public static int findRemainder(int dividend, int divisor) {

        return dividend % divisor;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dividend = input.nextInt();
        int divisor = input.nextInt();

        int quotient = findQuotient(dividend, divisor);
        int remainder = findRemainder(dividend, divisor);

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

        input.close();
    }
}
