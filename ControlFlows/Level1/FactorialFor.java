import java.util.Scanner;

// Class to compute factorial using for loop
class P15_FactorialFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int factorial = 1;
            // calculation of factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            //printing the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        } 
        // not natural number
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
