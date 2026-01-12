import java.util.Scanner;

class P02_FirstSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Taking 3 inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Checking if first number is smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
