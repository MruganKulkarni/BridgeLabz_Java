package Methods.Level1;

import java.util.Scanner;

class P03_TriangleParkRounds {

    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        return rounds;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required = " + rounds);
        input.close();
    }
}
