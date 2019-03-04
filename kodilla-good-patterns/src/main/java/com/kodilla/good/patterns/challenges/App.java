package com.kodilla.good.patterns.challenges;

public class App {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor(new InfoMailService(),
                new ProductOrderService(), new ProductOrderRepository());

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        orderProcessor.process(orderRequest);
    }
}
