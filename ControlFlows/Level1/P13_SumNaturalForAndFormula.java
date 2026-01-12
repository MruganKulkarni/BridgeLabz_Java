import java.util.Scanner;

class P13_SumNaturalForAndFormula {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int formulaSum = number * (number + 1) / 2;

            // For loop calculation
            int forSum = 0;

            for (int i = 1; i <= number; i++) {
                forSum += i;
            }

            // Compare results
            System.out.println("Sum using Formula = " + formulaSum);
            System.out.println("Sum using For Loop = " + forSum);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
