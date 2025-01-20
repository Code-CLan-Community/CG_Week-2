import java.util.Scanner;
//Item class
class Item {
    String itemCode;
    String itemName;
    double price;
    int quantity;
    //Method to display item details
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    //Method to calculate total cost for a given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class InventoryItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();
        System.out.println("Enter Item Code: ");
        item.itemCode = scanner.nextLine();
        System.out.println("Enter Item Name: ");
        item.itemName = scanner.nextLine();
        System.out.println("Enter Price: ");
        item.price = scanner.nextDouble();
        scanner.close();
        System.out.println("Enter Quantity: ");
        item.quantity = scanner.nextInt();
        item.displayItemDetails();
        System.out.println("Total Cost: " + item.calculateTotalCost(item.quantity));
    }
}
