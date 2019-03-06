package com.kodilla.good.patterns.flights;

public class FillBase {

    public static FlightsBase createFlightBase(){

        FlightsBase myFlightBase = new FlightsBase();
        myFlightBase.addFlight(new Flight(111, "Warszawa", "Kraków"));
        myFlightBase.addFlight(new Flight(112, "Kraków", "Warszawa"));
        myFlightBase.addFlight(new Flight(113, "Wrocław", "Warszawa"));
        myFlightBase.addFlight(new Flight(114, "Kraków", "Wrocław"));
        myFlightBase.addFlight(new Flight(115, "Wrocław", "Kraków"));
        myFlightBase.addFlight(new Flight(116, "Kraków", "Szczecin"));
        myFlightBase.addFlight(new Flight(117, "Wrocław", "Szczecin"));
        myFlightBase.addFlight(new Flight(118, "Szczecin", "Kraków"));
        myFlightBase.addFlight(new Flight(119, "Warszawa", "Wrocław"));
        myFlightBase.addFlight(new Flight(120, "Warszawa", "Szczecin"));
        myFlightBase.addFlight(new Flight(133, "Wrocław", "Szczecin"));

        return myFlightBase;
    }
}
