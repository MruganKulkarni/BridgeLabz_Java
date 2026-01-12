import java.util.Scanner;

class P06_PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check and display result
        if (number > 0) {
            System.out.println("Positive");
        } 
        else if (number < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }

    }
}
