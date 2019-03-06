package com.kodilla.good.patterns.food2door;

public class AppFood2Door {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRetrieverDto orderRetrieverDto = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SmsInfoService());
        orderProcessor.processOrder(orderRetrieverDto);
    }
}
