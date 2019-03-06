package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsBase {

    private Set<Flight> setOfFlights = new HashSet<>();

    public boolean addFlight(Flight flight) {
        return setOfFlights.add(flight);
    }

    public boolean removeFlight(Flight flight) {
        return setOfFlights.remove(flight);
    }


    public Set<Flight> getSetOfFlights() {
        return setOfFlights;
    }

    @Override
    public String toString() {
        return "FlightsBase{" +
                "listOfFlights=" + setOfFlights +
                '}';
    }
}
