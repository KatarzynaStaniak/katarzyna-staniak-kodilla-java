package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime orderTime, LocalDateTime deliveryTime) {
        System.out.println("Product Order Service Information: User " + user + " has bought product at " + orderTime.toString()+
                ". It will be delivered till " + deliveryTime.toString());
        return true;
    }
}
