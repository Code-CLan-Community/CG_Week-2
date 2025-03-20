public class VehicleManagement {
    public static void main(String[] args) {
        // Creating an instance of ElectricVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        ev.displayDetails();
        ev.charge();
        System.out.println();

        // Creating an instance of PetrolVehicle
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);
        pv.displayDetails();
        pv.refuel();
    }
}