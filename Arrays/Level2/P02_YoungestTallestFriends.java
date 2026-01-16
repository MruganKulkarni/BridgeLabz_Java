package Arrays.Level2;

import java.util.Scanner;

class P02_YoungestTallestFriends {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < age.length; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        int youngest = age[0];
        double tallest = height[0];

        for (int i = 1; i < age.length; i++) {

            // Find minimum age
            if (age[i] < youngest) {
                youngest = age[i];
            }

            // Find maximum height
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Tallest Height = " + tallest);

        input.close();
    }
}