package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("You basket: " + order + " in HealthyShop");
        System.out.println("Processing...");
        return true;
    }
}
