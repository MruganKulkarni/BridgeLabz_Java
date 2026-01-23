package Methods.Level1;

import java.util.Scanner;

class P10_WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74 + (0.6215 * temperature)
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        double result = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill = " + result);
        input.close();
    }
}
