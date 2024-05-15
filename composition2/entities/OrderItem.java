package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    public Product product;

    public OrderItem() {
    }

    public OrderItem(Product product, Double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public String toString() {
        return getProduct().getName()
                + ", $" + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: "
                + String.format("%.2f", subTotal());
    }
}
