package Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
public class ShippedOrder extends Order {

    /*
     This class represents an order that has been shipped.
     It extends the Order class by adding shipment-related
     information such as a tracking number.
    */

    // Stores shipment tracking number
    protected String trackingNumber;

    // Initializes shipped order details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Initialize base order details
        this.trackingNumber = trackingNumber;
    }

    // Returns shipped order status
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
