import java.util.Scanner;

class P12_SumNaturalWhileAndFormula {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            // Formula calculation
            int formulaSum = number * (number + 1) / 2;

            // While loop calculation
            int counter = 1;
            int whileSum = 0;

            while (counter <= number) {
                whileSum += counter;
                counter++;
            }

            System.out.println("Sum using Formula = " + formulaSum);
            System.out.println("Sum using While Loop = " + whileSum);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

    }
}
