// Superclass: Device
class Device {
    protected String deviceId;
    protected String status; // On or Off

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    private double temperatureSetting; // in Celsius

    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call to superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus(); // Display device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main Class to Demonstrate
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("TH-001", "On", 22.5);

        // Call displayStatus() to show device details
        thermostat.displayStatus();
    }
}
