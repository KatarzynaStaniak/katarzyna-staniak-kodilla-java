package com.kodilla.exception.test;

public class RouteFinderRunner {
    public static void main(String[] args) {
        Flight flight100 = new Flight("Warsaw", "Paris");
        Flight flight120 = new Flight("Paris", "London");
        Flight flight133 = new Flight("Tokyo", "London");
        Flight flight256 = new Flight("Berlin", "Warsaw");
        Flight flight124 = new Flight("New York", "Warsaw");
        Flight flight212 = new Flight("London", "Moscow");
        Flight flight876 = new Flight("Moscow", "New York");
        Flight flight231 = new Flight("Berlin", "Tokyo");

        RouteFinder.checkingAvailabilityInfo(flight100);
        RouteFinder.checkingAvailabilityInfo(flight876);
        RouteFinder.checkingAvailabilityInfo(flight133);
        RouteFinder.checkingAvailabilityInfo(flight124);
        RouteFinder.checkingAvailabilityInfo(flight120);
        RouteFinder.checkingAvailabilityInfo(flight256);
        RouteFinder.checkingAvailabilityInfo(flight212);
        RouteFinder.checkingAvailabilityInfo(flight231);
    }
}
