package ar.edu.undef.fie.vuelos.domain;

import java.util.*;

class Passenger {
    String name;
    String passportNumber;
    List<Flight> bookings;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.bookings = new ArrayList<>();
    }

    public void bookFlight(Flight flight) {
        bookings.add(flight);
    }

    public List<Flight> getBookings() {
        return bookings;
    }
}