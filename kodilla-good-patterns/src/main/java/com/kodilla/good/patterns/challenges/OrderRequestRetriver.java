package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Piotr", "Nowak");

        LocalDateTime orderTime = LocalDateTime.of(2019, 2, 14, 11, 8, 22);
        LocalDateTime deliveryTime = LocalDateTime.of(2018, 6, 24, 18, 3, 59);

        return new OrderRequest(user, orderTime, deliveryTime);
    }
}
