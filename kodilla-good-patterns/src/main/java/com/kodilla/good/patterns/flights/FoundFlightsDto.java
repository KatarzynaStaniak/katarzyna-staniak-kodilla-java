package com.kodilla.good.patterns.flights;

import java.util.List;

public class FoundFlightsDto {
    private List<Flight> foundFirstFlights;
    private List<Flight> foundSecondFlights;
    private String firstCity;
    private String lastCity;

    public FoundFlightsDto(List<Flight> foundFirstFlights, List<Flight> foundSecondFlights, String firstCity, String lastCity) {
        this.foundFirstFlights = foundFirstFlights;
        this.foundSecondFlights = foundSecondFlights;
        this.firstCity = firstCity;
        this.lastCity = lastCity;
    }

    public List<Flight> getFoundFirstFlights() {
        return foundFirstFlights;
    }

    public List<Flight> getFoundSecondFlights() {
        return foundSecondFlights;
    }

    @Override
    public String toString() {
        return "Found Connected Flights between " + firstCity + " and " + lastCity + ":\n" +
                "First Flights: " + foundFirstFlights +"\n" +
                "Second Flights: " + foundSecondFlights;
    }
}
