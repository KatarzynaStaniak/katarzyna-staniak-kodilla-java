package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class ConnectedFlightFinder {

    public static FoundFlightsDto findConnectedFlights(String firstCity, String lastCity, FlightsBase allFlights) {
        Set<Flight> firstFlights = new HashSet<>();
        Set<Flight> secondFlights = new HashSet<>();

        for (Flight flight : allFlights.getSetOfFlights()) {
            if (!(flight.getDepartureCity().equals(firstCity) && flight.getArrivalCity().equals(lastCity))) {

                if (flight.getDepartureCity().equals(firstCity)) {
                    firstFlights.add(flight);
                }

                if (flight.getArrivalCity().equals(lastCity)) {
                    secondFlights.add(flight);
                }
            }
        }

        Set<Flight> foundFirstFlights = new HashSet<>();
        Set<Flight> foundSecondFlights = new HashSet<>();
        for(Flight firstFlight:firstFlights){
            for (Flight secondFlight: secondFlights){
               if( firstFlight.getArrivalCity().equals(secondFlight.getDepartureCity())){
                   foundFirstFlights.add(firstFlight);
                   foundSecondFlights.add(secondFlight);
                }
            }
        }

        return new FoundFlightsDto(foundFirstFlights, foundSecondFlights, firstCity, lastCity);
    }
}
