public class TransportSystem {
    public static void main(String[] args) {
        // Create objects for each subclass
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", true);
        // Display information for each object
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
