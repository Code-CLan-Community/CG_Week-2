// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per km: " + ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car Class
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Bike Class
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Auto Class
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Main Class
public class RideHailingSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "John", 15);
        Vehicle bike = new Bike("B001", "Jane", 10);
        Vehicle auto = new Auto("A001", "Jack", 8);

        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 10 km: " + car.calculateFare(10));

        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));

        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare for 10 km: " + auto.calculateFare(10));
    }
}
