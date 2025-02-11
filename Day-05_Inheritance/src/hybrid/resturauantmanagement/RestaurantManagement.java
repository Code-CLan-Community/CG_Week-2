package hybridinheritance.resturauantmanagement;
// Main class to test the implementation
public class RestaurantManagement {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Chef chef = new Chef("Chef Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John", 102, "Outdoor");

        // Displaying details and duties for Chef
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        // Displaying details and duties for Waiter
        waiter.displayDetails();
        waiter.performDuties();
    }
}