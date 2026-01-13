package Arrays.Level1;

import java.util.Scanner;

class P09_Copy2DTo1DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();

                // Copy element while filling matrix
                array[index++] = matrix[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        input.close();
    }
}
