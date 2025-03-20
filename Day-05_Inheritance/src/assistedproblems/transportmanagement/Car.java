class Car extends Vehicle {
    int seatCapacity;

   // Constructor
   public Car(int maxSpeed, String fuelType, int seatCapacity) {
       super(maxSpeed, fuelType);
       this.seatCapacity = seatCapacity;
   }

   @Override
   public void displayInfo() {
       System.out.println("Car Info: Max Speed = " + maxSpeed + " km/h\nFuel Type = " + fuelType + "\nSeat Capacity = " + seatCapacity);
       System.out.println();
   }
}