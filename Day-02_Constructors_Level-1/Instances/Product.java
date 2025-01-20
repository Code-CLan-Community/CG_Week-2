class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Tablet", 499.99);

        // Display details of each product
        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        product3.displayProductDetails();
        System.out.println();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
