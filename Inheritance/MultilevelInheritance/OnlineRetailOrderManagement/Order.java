package Inheritance.MultilevelInheritance.OnlineRetailOrderManagement;
public class Order {

    /*
     This class represents a basic order in an online retail system.
     It serves as the base class in a multilevel inheritance hierarchy
     and contains common order-related attributes such as order ID
     and order date that apply to all types of orders.
    */

    // Stores unique order ID
    protected String orderId;

    // Stores order date
    protected String orderDate;

    // Initializes order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Returns current order status
    String getOrderStatus() {
        return "Order Placed";
    }
}
