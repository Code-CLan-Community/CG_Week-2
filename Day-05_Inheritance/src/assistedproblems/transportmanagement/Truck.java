// Subclass: Truck
class Truck extends Vehicle {
    int loadCapacity; // in tons

   // Constructor
   public Truck(int maxSpeed, String fuelType, int loadCapacity) {
       super(maxSpeed, fuelType);
       this.loadCapacity = loadCapacity;
   }

   @Override
   public void displayInfo() {
       System.out.println("Truck Info: Max Speed = " + maxSpeed + " km/h\nFuel Type = " + fuelType + "\nLoad Capacity = " + loadCapacity + " tons");
       System.out.println();
   }
}
