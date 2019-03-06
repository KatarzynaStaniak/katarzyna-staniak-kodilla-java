package com.kodilla.good.patterns.flights;

public class FlightsApp {
    public static void main(String[] args) {

        FlightsBase flightBase = FillBase.createFlightBase();

        SearchFlights searchFlights = new SearchFlights();
        FoundFlightsDto result = searchFlights.findConnectionBetweenTwoCities("Warszawa", "Szczecin", flightBase);
        System.out.println(result);

    }
}
