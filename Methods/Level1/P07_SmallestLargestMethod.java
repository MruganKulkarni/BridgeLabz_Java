package Methods.Level1;

import java.util.Scanner;

class P07_SmallestLargestMethod {

    public static int findSmallest(int a, int b, int c) {

        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    public static int findLargest(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int smallest = findSmallest(a, b, c);
        int largest = findLargest(a, b, c);

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);

        input.close();
    }
}
