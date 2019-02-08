package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenNumbersList = exterminator.exterminate(emptyList);
        System.out.println("Testing empty ArrayList");
        //Then
        Assert.assertTrue(evenNumbersList.size() == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(0);
        normalList.add(8);
        normalList.add(333);
        normalList.add(13);
        normalList.add(-11);
        normalList.add(24);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenNumbersList = exterminator.exterminate(normalList);
        System.out.println("Testing normal ArrayList");
        //Then
        Assert.assertTrue(evenNumbersList.size() == 3);
    }

}
