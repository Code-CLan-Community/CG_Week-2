class Motorcycle extends Vehicle{
    boolean hasCarrier;
   // Constructor
   public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
       super(maxSpeed, fuelType);
       this.hasCarrier = hasCarrier;
   }
   @Override
   public void displayInfo() {
       System.out.println("Motorcycle Info: Max Speed = " + maxSpeed + " km/h\nFuel Type = " + fuelType + "\nHas Carrier = " + hasCarrier);
       System.out.println();
   }
}
