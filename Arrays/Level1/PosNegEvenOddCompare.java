package Arrays.Level1;

import java.util.Scanner;

class P02_PosNegEvenOddCompare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                
                // checking if numbers are odd or even
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
                // checking negative vals
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }
        // defining first and last numbers
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        
        if (first == last) {
            System.out.println("First and Last elements are Equal");
        } else if (first > last) {
            System.out.println("First element is Greater than Last");
        } else {
            System.out.println("First element is Less than Last");
        }

        input.close();
    }
}
