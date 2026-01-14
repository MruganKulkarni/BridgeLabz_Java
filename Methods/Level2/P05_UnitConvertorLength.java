package Methods.Level2;

import java.util.Scanner;

class P05_UnitConvertorLength {

    public static double convertKmToMiles(double km) {

        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {

        return miles / 0.621371;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Miles = " + convertKmToMiles(value));
        } else if (choice == 2) {
            System.out.println("Km = " + convertMilesToKm(value));
        } else {
            System.out.println("Invalid Choice");
        }

        input.close();
    }
}
