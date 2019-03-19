package com.kodilla.patterns.strategy.social;

import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kate = new Millenials("Kate");
        User paul = new ZGeneration("Paul");
        User frank = new YGeneration("Frank");

        //When
        System.out.println("Kate shares posts on: ");
        kate.sharePost();
        System.out.println("Paul shares posts on: ");
        paul.sharePost();
        System.out.println("Frank shares posts on: ");
        frank.sharePost();

        //Then
        //nothing
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ann = new Millenials("Ann");
        System.out.println("Ann shares posts on: ");
        ann.sharePost();

        //When
        ann.setSharingSocialPublisher(new FacebookPublisher());
        System.out.println("NOW Ann shares posts on: ");
        ann.sharePost();

        //Then
        //nothing
    }

}
