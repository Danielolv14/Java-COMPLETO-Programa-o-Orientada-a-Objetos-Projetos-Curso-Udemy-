package entities;

import entities.Product;

public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    public OrderItem(Integer quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Product getProduct() { return product; }
    public Integer getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public double subTotal() {
        return quantity * price;
    }
}