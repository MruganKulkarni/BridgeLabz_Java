import java.util.Scanner;

class P10_SumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();

        // Continue loop until 0 is entered
        while (number != 0) {
            total += number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        // Display total sum
        System.out.println("The total sum is " + total);

    }
}
