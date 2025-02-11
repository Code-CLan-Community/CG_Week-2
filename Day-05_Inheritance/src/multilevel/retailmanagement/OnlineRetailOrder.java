public class OnlineRetailOrder {
    public static void main(String[] args) {
        // Create an Order object
        Order order = new Order("ORD123", "2025-01-20");
        System.out.println(order.getOrderStatus());

        // Create a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-01-21", "TRK98765");
        System.out.println(shippedOrder.getOrderStatus());

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-01-22", "TRK54321", "2025-01-24");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
