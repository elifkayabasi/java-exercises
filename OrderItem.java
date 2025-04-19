public class OrderItem {
    public int quantity;
    public Order order; // ilişkili sınıf

    public double getItemTotal() {
        return quantity * order.getTotal();
    }
}
