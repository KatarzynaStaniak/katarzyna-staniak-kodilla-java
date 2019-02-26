package com.kodilla.exception.test;

public class RouteFinderRunner {
    public static void main(String[] args) {
        Flight flight100 = new Flight("Warsaw", "Paris");
        Flight flight120 = new Flight("Paris", "London");
        Flight flight133 = new Flight("Tokyo", "London");
        Flight flight256 = new Flight("Berlin", "Warsaw");
        Flight flight124 = new Flight("New York", "Warsaw");

        RouteFinder routeFinder = new RouteFinder();
        try {
            String availabilityOfFlight100 = routeFinder.findFlight(flight100);
            System.out.println(availabilityOfFlight100);
            System.out.println();

            String availabilityOfFlight256 = routeFinder.findFlight(flight256);
            System.out.println(availabilityOfFlight256);
            System.out.println();

            String availabilityOfFlight120 = routeFinder.findFlight(flight120);
            System.out.println(availabilityOfFlight120);
            System.out.println();

            String availabilityOfFlight133 = routeFinder.findFlight(flight133);
            System.out.println(availabilityOfFlight133);
            System.out.println();

            String availabilityOfFlight124 = routeFinder.findFlight(flight124);
            System.out.println(availabilityOfFlight124);
            System.out.println();
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
            System.out.println("Processing finished");
        }

    }
}
