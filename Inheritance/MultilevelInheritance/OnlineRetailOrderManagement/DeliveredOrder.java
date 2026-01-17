package Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
public class DeliveredOrder extends ShippedOrder {

    /*
     This class represents an order that has been delivered.
     It extends the ShippedOrder class by adding delivery-specific
     information such as delivery date, completing the multilevel chain.
    */

    // Stores delivery date
    private String deliveryDate;

    // Initializes delivered order details
    public DeliveredOrder(String orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Initialize shipped order details
        this.deliveryDate = deliveryDate;
    }

    // Returns delivered order status
    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    public static void main(String[] args) {
        // Creating DeliveredOrder object
        DeliveredOrder order =
                new DeliveredOrder("ORD101", "2024-10-01",
                        "TRK12345", "2024-10-05");

        // Displaying order status
        System.out.println(order.getOrderStatus());
    }
}
