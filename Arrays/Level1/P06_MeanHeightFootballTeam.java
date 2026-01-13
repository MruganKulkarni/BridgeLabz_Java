package Arrays.Level1;

import java.util.Scanner;

class P06_MeanHeightFootballTeam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {

            heights[i] = input.nextDouble();

            // Reject negative height
            if (heights[i] <= 0) {
                System.err.println("Invalid Height");
                input.close();
                return;
            }

            sum += heights[i];
        }

        double meanHeight = sum / heights.length;
        System.out.println("Mean Height = " + meanHeight);
        input.close();
    }
}
