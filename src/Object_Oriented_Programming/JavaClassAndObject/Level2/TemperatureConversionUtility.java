package JavaClassAndObject.Level2;

public class TemperatureConversionUtility {

    /*
     * This class performs temperature conversion between
     * Celsius and Fahrenheit. It demonstrates how objects
     * can be used to perform logical operations through methods.
     */

    private double celsius;

    public TemperatureConversionUtility(double celsius) {
        this.celsius = celsius;
    }

    public double convertToFahrenheit() {
        // Conversion formula from Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }
    // Display
    public void displayConversion() {
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + convertToFahrenheit());
    }

    public static void main(String[] args) {
        TemperatureConversionUtility temp = new TemperatureConversionUtility(36.5);
        temp.displayConversion();
    }
}
