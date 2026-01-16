package Methods.Level2;

import java.util.Scanner;

class P09_YoungestTallestMethod {

    public static int findYoungest(int[] age) {

        int youngest = age[0];

        for (int i = 1; i < age.length; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
        }

        return youngest;
    }

    public static double findTallest(double[] height) {

        double tallest = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < age.length; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        System.out.println("Youngest = " + findYoungest(age));
        System.out.println("Tallest = " + findTallest(height));

        input.close();
    }
}
