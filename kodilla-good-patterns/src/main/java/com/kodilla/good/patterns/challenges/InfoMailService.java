package com.kodilla.good.patterns.challenges;

public class InfoMailService implements InfoService {
    public void inform(User user){
        System.out.println("Mail sent to " + user + "." );

    }
}
