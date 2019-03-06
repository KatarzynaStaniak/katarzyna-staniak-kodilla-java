package com.kodilla.good.patterns.food2door;

public class SmsInfoService implements InfoService {

    @Override
    public void sendInfo() {
        System.out.println("Order completed.");
    }
}
