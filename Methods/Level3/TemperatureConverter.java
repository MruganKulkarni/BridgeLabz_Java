package Methods.Level3;
public class TemperatureConverter {

    /*
     * Problem Statement:
     * Convert temperature from Celsius to Fahrenheit
     * using a method.
     */

    double convertToFahrenheit(double celsius) {
        // Applies Celsius to Fahrenheit conversion formula
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter obj = new TemperatureConverter();

        double celsius = 30;
        System.out.println("Fahrenheit: " + obj.convertToFahrenheit(celsius));
    }
}
