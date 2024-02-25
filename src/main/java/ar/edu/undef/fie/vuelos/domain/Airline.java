package ar.edu.undef.fie.vuelos.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Airline {
    String name;
    Map<String, Flight> flights;

    public Airline(String name) {
        this.name = name;
        this.flights = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        flights.put(flight.flightNumber, flight);
    }

    public boolean bookFlight(String flightNumber, Passenger passenger) {
        Flight flight = flights.get(flightNumber);
        if (flight != null && flight.bookFlight()) {
            passenger.bookFlight(flight);
            return true;
        } else {
            return false;
        }
    }

    public Flight getFlight(String flightNumber) {
        return flights.get(flightNumber);
    }

    public List<Flight> getAvailableFlights() {
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight flight : flights.values()) {
            if (flight.availableSeats > 0) {
                availableFlights.add(flight);
            }
        }
        return availableFlights;
    }
}