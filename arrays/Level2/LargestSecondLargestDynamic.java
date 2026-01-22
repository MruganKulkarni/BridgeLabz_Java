package Arrays.Level2;

import java.util.Scanner;

class P04_LargestSecondLargestDynamic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxSize = 5;
        int[] numbers = new int[maxSize];
        int index = 0;

        while (true) {

            int value = input.nextInt();

            // Stop input when user enters 0
            if (value == 0) {
                break;
            }

            // Expand array size when limit reached
            if (index == maxSize) {

                maxSize = maxSize * 2;
                int[] temp = new int[maxSize];

                for (int i = 0; i < numbers.length; i++) {
                    temp[i] = numbers[i];
                }
                numbers = temp;
            }

            numbers[index++] = value;
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < index; i++) {

            // Update largest and second largest values
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        input.close();
    }
}

