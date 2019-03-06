package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class SearchFlights {

    public Set<Flight> findFlightFromCity(String city, FlightsBase flightsBase) {

        Set<Flight> flightsFromCity = flightsBase.getSetOfFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(city))
                .collect(Collectors.toSet());

        return flightsFromCity;
    }

    public Set<Flight> findFlightToCity(String city, FlightsBase flightsBase) {

        Set<Flight> flightsToCity = flightsBase.getSetOfFlights().stream()
                .filter(flight -> flight.getArrivalCity().equals(city))
                .collect(Collectors.toSet());

        return flightsToCity;
    }

    public FoundFlightsDto findConnectionBetweenTwoCities(String firstCity, String lastCity, FlightsBase flightsBase) {
        return ConnectedFlightFinder.findConnectedFlights(firstCity, lastCity, flightsBase);
    }
}
