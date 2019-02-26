package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(11.25, 2.34);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("We have some trouble.");
        } finally {
            System.out.println("End of program.");
        }
    }
}
