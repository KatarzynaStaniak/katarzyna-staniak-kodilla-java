package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlights {

    public List<Flight> findFlightFromCity(String city, FlightsBase flightsBase) {

        List<Flight> flightsFromCity = flightsBase.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureCity().equals(city))
                .collect(Collectors.toList());

        return flightsFromCity;
    }

    public List<Flight> findFlightToCity(String city, FlightsBase flightsBase) {

        List<Flight> flightsToCity = flightsBase.getListOfFlights().stream()
                .filter(flight -> flight.getArrivalCity().equals(city))
                .collect(Collectors.toList());

        return flightsToCity;
    }

    public FoundFlightsDto findConnectionBetweenTwoCities(String firstCity, String lastCity, FlightsBase flightsBase) {
        return ConnectedFlightFinder.findConnectedFlights(firstCity, lastCity, flightsBase);
    }
}
