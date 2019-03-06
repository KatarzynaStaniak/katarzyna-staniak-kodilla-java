package com.kodilla.good.patterns.food2door;

public class OrderRetriever {

    public OrderRetrieverDto retrieve() {
        Producer producer = new GlutenFreeShop();
        Product productButter = new Product("Butter", 200);
        int quantity = 12;

        return new OrderRetrieverDto(producer, new Order(productButter, quantity));
    }
}
