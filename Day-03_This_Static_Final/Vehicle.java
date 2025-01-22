public class Vehicle {
    // Static variable shared by all vehicles for the registration fee
    static double registrationFee = 100.0;  // Example fee value

    // Final variable for registration number to uniquely identify each vehicle
    final String registrationNumber;

    // Instance variables for owner name and vehicle type
    String ownerName;
    String vehicleType;

    // Constructor to initialize owner name, vehicle type, and registration number
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;  // Unique registration number
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle registration details if the object is an instance of Vehicle
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Veer", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Dhruv", "Motorcycle", "XYZ456");

        // Displaying initial registration details for both vehicles
        System.out.println("\nVehicle 1 Registration Details:");
        vehicle1.displayRegistrationDetails();

        System.out.println("\nVehicle 2 Registration Details:");
        vehicle2.displayRegistrationDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(150.0);

        // Displaying updated registration details for both vehicles
        System.out.println("\nUpdated Registration Details:");
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
