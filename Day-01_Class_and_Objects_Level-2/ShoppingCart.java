class CartItem {
    private String itemName;
    private int price;
    private int quantity;
    private int totalCost;

    public CartItem(String item, int price, int quantity, int totalCost) {
        this.itemName = item;
        this.price = price;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
    }

    public void removeItem(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        }
    }

    public int calculateTotalCost() {
        return this.price * this.quantity;
    }

    public String toString() {
        return "Item: " + this.itemName + ", Price: " + this.price + ", Quantity: " + this.quantity + ", Total Cost: "
                + this.totalCost;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Apple", 10, 2, 20);
        System.out.println(item1.toString());
        item1.addItem(3);
        System.out.println(item1.toString());
        item1.removeItem(1);
        System.out.println(item1.toString());
        System.out.println("Total Cost: " + item1.calculateTotalCost());
    }
}
