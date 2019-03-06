package com.kodilla.good.patterns.food2door;

public class OrderRetrieverDto {

    private Producer producer;
    private Order order;

    public OrderRetrieverDto(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public Producer getProducer() {
        return producer;
    }

    public Order getOrder() {
        return order;
    }
}
