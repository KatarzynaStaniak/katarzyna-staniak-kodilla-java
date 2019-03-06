package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("This order is being processed by ExtraFoodShop");
        System.out.println(order);
        System.out.println("Processing...");
        return true;
    }
}
