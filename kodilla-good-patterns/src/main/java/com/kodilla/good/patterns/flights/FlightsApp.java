package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightsApp {
    public static void main(String[] args) {

        FlightsBase flightBase = FillBase.createFlightBase();

        SearchFlights searchFlights = new SearchFlights();
        FoundFlightsDto result = searchFlights.findConnectionBetweenTwoCities("Warszawa", "Szczecin", flightBase);
        System.out.println(result);
        System.out.println();

        Set<Flight> toWroc = searchFlights.findFlightToCity("Wrocław", flightBase);
        System.out.println("Flights to Wrocław: " + toWroc);
        System.out.println();

        Set<Flight> fromWar = searchFlights.findFlightFromCity("Warszawa", flightBase);
        System.out.println("Flights from Warszawa: " + fromWar);
        System.out.println();

    }
}
