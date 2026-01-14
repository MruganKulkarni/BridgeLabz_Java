package Methods.Level2;

import java.util.Scanner;

class P07_UnitConvertorTemperatureWeight {

    public static double convertCelsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertKgToPound(double kg) {

        return kg * 2.20462;
    }

    public static double convertPoundToKg(double pound) {

        return pound / 2.20462;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Fahrenheit = " + convertCelsiusToFahrenheit(value));
        } 
        else if (choice == 2) {
            System.out.println("Celsius = " + convertFahrenheitToCelsius(value));
        } 
        else if (choice == 3) {
            System.out.println("Pounds = " + convertKgToPound(value));
        } 
        else if (choice == 4) {
            System.out.println("Kg = " + convertPoundToKg(value));
        } 
        else {
            System.out.println("Invalid Choice");
        }

        input.close();
    }
}
