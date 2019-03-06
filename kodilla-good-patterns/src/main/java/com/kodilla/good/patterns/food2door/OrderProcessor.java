package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InfoService infoService;

    public OrderProcessor(InfoService infoService) {
        this.infoService = infoService;
    }

    public void processOrder(OrderRetrieverDto orderRetrieverDto) {
        Producer producer = orderRetrieverDto.getProducer();
        Order order = orderRetrieverDto.getOrder();
        boolean isProcessed = producer.process(order);

        if (isProcessed) {
            infoService.sendInfo();
        } else {
            System.out.println("Order failed.");
        }
    }
}
