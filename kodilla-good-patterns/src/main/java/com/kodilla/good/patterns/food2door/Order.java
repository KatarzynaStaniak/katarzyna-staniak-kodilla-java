package com.kodilla.good.patterns.food2door;

public class Order {

    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order: (product: " + product + ", quantity: " + quantity + ")";
    }
}
