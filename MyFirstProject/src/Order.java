
public class Order {

    private Customer customer;
    private Product product;

    public Order(Customer customer, String productName, int price) {
        this.customer = customer;
        this.product = new Product(productName, price);
    }

    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    @Override
    public String toString() {
        String prettyPrint = customer.toString() + "[상품명] " + this.product.getName()
        + ", [가격(원)] " + this.product.getPrice();
        return prettyPrint;
    }

    public Customer getCustomer() {
        return customer;
    }

}
