public class ShoppingCartSystem {
    // Static attribute shared by all products
    static double discount = 0.0;
    // Final attribute for product ID
    final int productId;
    String productName;
    int price;
    int quantity;
    double discountPrice;
    // Constructor to initialize product details
    ShoppingCartSystem(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId; 
        this.discountPrice = price * quantity; 
    }
    // Static method to update the discount for a single product
    static void updateDiscount(double newDiscount, ShoppingCartSystem product) {
        discount = newDiscount;
        // Apply discount to the given product
        product.discountPrice = product.price * product.quantity
                - (product.price * product.quantity * discount / 100);
    }
    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price after Discount: $" + discountPrice);
    }
    public static void main(String[] args) {
        // Creating product instances
        ShoppingCartSystem product1 = new ShoppingCartSystem("Vostro", 51000, 7, 1001);
        ShoppingCartSystem product2 = new ShoppingCartSystem("Omen", 74000, 5, 1002);
        // Applying discount to each product individually
        updateDiscount(10.0, product1);
        updateDiscount(10.0, product2);
        // Displaying details of all products
        System.out.println("\nProduct 1 Details:");
        product1.displayDetails();
        System.out.println("\nProduct 2 Details:");
        product2.displayDetails();
    }
}
