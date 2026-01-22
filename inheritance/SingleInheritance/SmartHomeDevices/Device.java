package Inheritance.SingleInheritance.SmartHomeDevices;
public class Device {

    /*
     This class represents a generic smart home device.
     It acts as the superclass containing common properties
     such as device ID and status, which can be inherited
     by more specialized smart devices.
    */

    // Stores device ID
    protected String deviceId;

    // Stores device status
    protected String status;

    // Initializes device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Displays device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
