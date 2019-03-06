package com.kodilla.good.patterns.flights;

public class Flight {
    private int flightNumber;
    private String departureCity;
    private String arrivalCity;

    public Flight(int flightNumber, String departureCity, String arrivalCity) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        return arrivalCity.equals(flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                '}';
    }
}
