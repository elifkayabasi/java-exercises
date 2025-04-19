public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.id = 1;
        order.price = 100;
        order.tax = 18;

        OrderItem item = new OrderItem();
        item.quantity = 2;
        item.order = order;

        System.out.println("Toplam: " + item.getItemTotal());
    }
}
