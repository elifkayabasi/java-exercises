public class order extends BaseEntity {
    public double price;
    public double tax;

    public double getTotal() {
        return price + tax;
    }
}
