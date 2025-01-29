// Importing ArrayList class
import java.util.ArrayList;

// Creating Product class to store product details
class Product 
{
    // Creating attributes of the product class
    String productName;
    double price;

    // Creating Constructor of the class
    Product(String productName, double price) 
	{
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() 
	{
        System.out.println("Product name is " + productName);
		System.out.println("Price is " + price);
    }
}

// Creating Order class to store order details
class Order 
{
    // Creating attributes of the order class
    int orderId;
    ArrayList<Product> products;

    // Creating Constructor of the class
    Order(int orderId) 
	{
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Method to add products to the order
    public void addProduct(Product product) 
	{
        products.add(product);
    }

    // Method to display order details
    public void displayOrderDetails() 
	{
        System.out.println("Order ID is " + orderId);
        for (Product product : products) 
		{
            product.displayProductDetails();
        }
    }
}

// Creating Customer class to store customer details
class Customer 
{
    // Creating attributes of the customer class
    String customerName;
    ArrayList<Order> orders;

    // Creating Constructor of the class
    Customer(String customerName) 
	{
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) 
	{
        orders.add(order);
    }

    // Method to display customer details
    public void displayCustomerDetails() 
	{
        System.out.println("Customer name is " + customerName);
        for (Order order : orders)
		{
            order.displayOrderDetails();
        }
    }
}

// Creating Main class
class EcommercePlatform 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating objects of Product class
        Product product1 = new Product("Laptop", 30000);
        Product product2 = new Product("Phone", 15000);

        // Creating object of Order class
        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Creating object of Customer class
        Customer customer1 = new Customer("Neeraj");

        // Customer placing an order
        customer1.placeOrder(order1);

        // Displaying customer details and their orders
        customer1.displayCustomerDetails();
    }
}
