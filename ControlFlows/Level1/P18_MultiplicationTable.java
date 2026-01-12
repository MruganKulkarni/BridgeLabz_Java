import java.util.Scanner;

// Class to print multiplication table from 6 to 9
class P18_MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // multiplication
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
