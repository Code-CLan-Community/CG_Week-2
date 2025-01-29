class Product {
    private String name;
    private float pricePerUnit;
    private float quantity;

    // Constructor
    public Product(String name, float pricePerUnit, float quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class Customer {
    private String name;
    private Product[] products;
    private int productCount;

    // Constructor
    public Customer(String name, int maxProducts) {
        this.name = name;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    // Add a product
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Cannot add more products. Maximum limit reached.");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getProductCount() {
        return productCount;
    }
}

class BillGenerator {
    // Method to calculate total
    public float computeTotal(Customer customer) {
        float total = 0;
        Product[] products = customer.getProducts();

        for (int i = 0; i < customer.getProductCount(); i++) {
            total += products[i].getTotalPrice();
        }

        return total;
    }
}

// Main Class to demonstrate
public class GroceryStore {
    public static void main(String[] args) {
        Customer customer = new Customer("Rishabh", 5); // Maximum of 5 products

        // Adding products to the customer
        customer.addProduct(new Product("Apples", 3, 2));  // 2 kg at $3/kg
        customer.addProduct(new Product("Milk", 2, 1));    // 1 litre at $2/litre

        BillGenerator billGenerator = new BillGenerator();
        float totalBill = billGenerator.computeTotal(customer);

        System.out.println("Customer: " + customer.getName());
        for (int i = 0; i < customer.getProductCount(); i++) {
            Product product = customer.getProducts()[i];
            System.out.println(product.getName() + ": " + product.getQuantity() +
                    " units @ $" + product.getPricePerUnit() + " each");
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
