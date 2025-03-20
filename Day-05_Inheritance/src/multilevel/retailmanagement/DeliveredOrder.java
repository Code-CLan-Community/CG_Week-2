// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
 
     // Constructor
     public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
         super(orderId, orderDate, trackingNumber); // Call to superclass constructor
         this.deliveryDate = deliveryDate;
     }
 
     @Override
     public String getOrderStatus() {
         return super.getOrderStatus() + ". Delivered on: " + deliveryDate;
     }
 }