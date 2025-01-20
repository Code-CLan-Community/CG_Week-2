import java.util.Scanner;
// Creating a class MobilePhone to store the details of the phone.
class MobilePhone {
    // Attributes
    String brand;
    String model;
    float price;

    // Method to display the details of the phone
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
// Creating a class HandleMobileDetails to handle the mobile phone details
public class HandleMobileDetails {
    public static void main(String[] args) {
        // Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // Creating an object of MobilePhone class
        MobilePhone phone = new MobilePhone();
        // Taking input from the user
        System.out.println("Enter the brand of the phone: ");
        phone.brand = sc.nextLine();
        System.out.println("Enter the model of the phone: ");
        phone.model = sc.nextLine();
        System.out.println("Enter the price of the phone: ");
        phone.price = sc.nextFloat();
        // Displaying the details of the phone
        phone.displayDetails();
        sc.close();
    }
}
