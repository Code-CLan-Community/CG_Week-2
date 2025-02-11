import java.util.*;

abstract class Product implements Taxable {
   final private int productId;
   final private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Tax rate: 18%";
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; // No discount
    }
}

interface Taxable{
    double calculateTax();

    String getTaxDetails();
}

public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1000));

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product.getPrice() * 0.18; 
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
