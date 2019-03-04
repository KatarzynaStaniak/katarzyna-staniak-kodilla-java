package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, LocalDateTime orderTime, LocalDateTime deliveryTime){
        System.out.println("Order saved. Order info: " + user + ", order Time: " + orderTime +
                ", delivery Time: " + deliveryTime);

    }
}
