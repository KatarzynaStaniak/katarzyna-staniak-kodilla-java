package com.kodilla.good.patterns.food2door;

public class Product {

    private String productName;
    private double productWeight;

    public Product(String productName, double productWeight) {
        this.productName = productName;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductWeight() {
        return productWeight;
    }

    @Override
    public String toString() {
        return productName + ", " + productWeight + " g";
    }
}
