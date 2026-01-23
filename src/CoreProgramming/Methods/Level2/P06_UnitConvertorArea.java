package Methods.Level2;
import java.util.Scanner;

class P06_UnitConvertorArea {

    public static double convertSquareFeetToSquareMeter(double sqFeet) {

        return sqFeet * 0.092903;
    }

    public static double convertSquareMeterToSquareFeet(double sqMeter) {

        return sqMeter / 0.092903;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Square Meter = " + convertSquareFeetToSquareMeter(value));
        } 
        else if (choice == 2) {
            System.out.println("Square Feet = " + convertSquareMeterToSquareFeet(value));
        } 
        else {
            System.out.println("Invalid Choice");
        }

        input.close();
    }
}
