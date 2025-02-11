class Vehicle {
    int maxSpeed;
    String fuelType;

   // Constructor
   public Vehicle(int maxSpeed, String fuelType) {
       this.maxSpeed = maxSpeed;
       this.fuelType = fuelType;
   }

   // Method to display vehicle information
   public void displayInfo() {
       System.out.println("Vehicle Info: Max Speed = " + maxSpeed + " km/h, Fuel Type = " + fuelType);
   }
}