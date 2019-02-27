package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteFinder {
    private static boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availablityOfAirport = new HashMap<>();
        availablityOfAirport.put("Warsaw", true);
        availablityOfAirport.put("Berlin", false);
        availablityOfAirport.put("London", true);
        availablityOfAirport.put("Paris", true);
        availablityOfAirport.put("Tokyo", false);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();
        System.out.println("Looking for route from " + departureAirport + " to " + arrivalAirport + "...");

        String missingAirports = "";

        if (!(availablityOfAirport.containsKey(arrivalAirport) && availablityOfAirport.containsKey(departureAirport))) {

            if (!(availablityOfAirport.containsKey(arrivalAirport)) && !(availablityOfAirport.containsKey(departureAirport))) {
                missingAirports = "airports " + departureAirport + " and " + arrivalAirport + " don't exist!";
            } else {
                if (!(availablityOfAirport.containsKey(arrivalAirport))) {
                    missingAirports = "arrival airport " + arrivalAirport + " doesn't exist!";
                } else {
                    missingAirports = "departure airport " + departureAirport + " doesn't exist";
                }
            }
            throw new RouteNotFoundException("Route is not found - " + missingAirports);
        } else {
            return availablityOfAirport.get(arrivalAirport) && availablityOfAirport.get(departureAirport);
        }
    }

    public static void checkingAvailabilityInfo(Flight flight) {
        try {
            boolean availability = findFlight(flight);
            if (availability) {
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is NOT available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Searching for " + flight + " finished.");
            System.out.println();
        }


    }
}
