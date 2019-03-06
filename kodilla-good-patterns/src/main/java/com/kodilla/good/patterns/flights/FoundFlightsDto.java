package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FoundFlightsDto {
    private Set<Flight> foundFirstFlights;
    private Set<Flight> foundSecondFlights;
    private String firstCity;
    private String lastCity;

    public FoundFlightsDto(Set<Flight> foundFirstFlights, Set<Flight> foundSecondFlights, String firstCity, String lastCity) {
        this.foundFirstFlights = foundFirstFlights;
        this.foundSecondFlights = foundSecondFlights;
        this.firstCity = firstCity;
        this.lastCity = lastCity;
    }

    public Set<Flight> getFoundFirstFlights() {
        return foundFirstFlights;
    }

    public Set<Flight> getFoundSecondFlights() {
        return foundSecondFlights;
    }

    @Override
    public String toString() {
        return "Found Connected Flights between " + firstCity + " and " + lastCity + ":\n" +
                "First Flights: " + foundFirstFlights +"\n" +
                "Second Flights: " + foundSecondFlights;
    }
}
