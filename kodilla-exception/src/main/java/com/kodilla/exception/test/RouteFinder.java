package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {
    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availablityOfAirport = new HashMap<>();
        availablityOfAirport.put("Warsaw", true);
        availablityOfAirport.put("Berlin", false);
        availablityOfAirport.put("London", true);
        availablityOfAirport.put("Paris", true);
        availablityOfAirport.put("Tokyo", false);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();
        System.out.println("Looking for route from " + departureAirport + " to " + arrivalAirport + "...");

        if (!(availablityOfAirport.containsKey(arrivalAirport) && availablityOfAirport.containsKey(departureAirport)))
            throw new RouteNotFoundException("Route is not found. Departure airport, arrival airport or both don't exist!");

        if (availablityOfAirport.containsKey(arrivalAirport) && availablityOfAirport.get(arrivalAirport)) {
            if (availablityOfAirport.containsKey(departureAirport) && availablityOfAirport.get(departureAirport)) {
                return "Route from " + departureAirport + " to " + arrivalAirport + " is available";
            }
        }

        return "Route from " + departureAirport + " to " + arrivalAirport + " is NOT available now";

    }
}
