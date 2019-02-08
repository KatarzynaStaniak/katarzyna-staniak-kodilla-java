package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        System.out.println("Test1 - User Name: ");

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();

        // test - method add
        System.out.println("Test2 - method add(int a, int b): ");
        Calculator calculator = new Calculator();
        int addResult = calculator.add(5,43);

        if(addResult == (5+43)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();

        //test - method subtract
        System.out.println("Test3 - method subtract(int a, int b): ");
        int subtractResult = calculator.subtract(99, 23);

        if(subtractResult == (99 - 23)){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
