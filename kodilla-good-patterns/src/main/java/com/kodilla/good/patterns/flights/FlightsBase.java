package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

public class FlightsBase {

    private ArrayList<Flight> listOfFlights = new ArrayList<>();

    public boolean addFlight(Flight flight) {
        return listOfFlights.add(flight);
    }

    public boolean removeFlight(Flight flight) {
        return listOfFlights.remove(flight);
    }


    public ArrayList<Flight> getListOfFlights() {
        return listOfFlights;
    }

    @Override
    public String toString() {
        return "FlightsBase{" +
                "listOfFlights=" + listOfFlights +
                '}';
    }
}
