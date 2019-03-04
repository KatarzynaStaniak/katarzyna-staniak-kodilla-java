package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;

    public OrderRequest(final User user, final LocalDateTime orderTime, final LocalDateTime deliveryTime) {
        this.user = user;
        this.orderTime = orderTime;
        this.deliveryTime = deliveryTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }
}
