// Subclass: PetrolVehicle

import assistedproblems.transportmanagement.Vehicle;

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementing the refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with a tank capacity of " + fuelTankCapacity + " liters.");
    }
}