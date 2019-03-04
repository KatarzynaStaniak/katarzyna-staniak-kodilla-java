package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InfoService infoService;
    private OrderService orderService;
    private  OrderRepository orderRepository;

    public OrderProcessor(final InfoService infoService, final OrderService orderService, final OrderRepository orderRepository) {
        this.infoService = infoService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getDeliveryTime());

        if(isOrdered){
            infoService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderTime(), orderRequest.getDeliveryTime());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
