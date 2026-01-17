package Inheritance.SingleInheritance.SmartHomeDevices;
public class Thermostat extends Device {

    /*
     This class represents a thermostat in a smart home system.
     It extends the Device class by adding temperature control
     functionality while retaining common device properties.
    */

    // Stores temperature setting
    private int temperatureSetting;

    // Initializes thermostat details using super
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Initialize Device attributes
        this.temperatureSetting = temperatureSetting;
    }

    // Displays thermostat status and temperature
    @Override
    void displayStatus() {
        super.displayStatus(); // Display base device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        // Creating Thermostat object
        Thermostat thermostat =
                new Thermostat("TH-101", "ON", 24);

        // Displaying thermostat details
        thermostat.displayStatus();
    }
}
