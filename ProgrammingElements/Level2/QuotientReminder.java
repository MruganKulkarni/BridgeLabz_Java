import java.util.Scanner;

class P06_QuotientReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int number2 = input.nextInt();
        // calculate quotient
        int quotient = number1 / number2;
        // calculate remainder
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);

        input.close();
    }
}
