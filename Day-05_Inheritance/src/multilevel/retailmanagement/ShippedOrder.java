class ShippedOrder extends Order {
    String trackingNumber;
   // Constructor
   public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
       super(orderId, orderDate); // Call to superclass constructor
       this.trackingNumber = trackingNumber;
   }

   @Override
   public String getOrderStatus() {
       return super.getOrderStatus() + " and shipped with tracking number: " + trackingNumber;
   }
}