// Subclass: ElectricVehicle

import assistedproblems.transportmanagement.Vehicle;

class ElectricVehicle extends Vehicle {
     int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display the charging behavior
    public void charge() {
        System.out.println("Charging the electric vehicle with a battery capacity of " + batteryCapacity + " kWh.");
    }
}