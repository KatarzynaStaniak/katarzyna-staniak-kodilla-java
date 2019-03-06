package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class ConnectedFlightFinder {

    public static FoundFlightsDto findConnectedFlights(String firstCity, String lastCity, FlightsBase allFlights) {
        List<Flight> firstFlights = new ArrayList<>();
        List<Flight> secondFlights = new ArrayList<>();

        for (Flight flight : allFlights.getListOfFlights()) {
            if (!(flight.getDepartureCity().equals(firstCity) && flight.getArrivalCity().equals(lastCity))) {

                if (flight.getDepartureCity().equals(firstCity)) {
                    firstFlights.add(flight);
                }

                if (flight.getArrivalCity().equals(lastCity)) {
                    secondFlights.add(flight);
                }
            }
        }

        List<Flight> foundFirstFlights = new ArrayList<>();
        List<Flight> foundSecondFlights = new ArrayList<>();
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
