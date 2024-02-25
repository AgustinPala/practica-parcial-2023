package ar.edu.undef.fie.vuelos.domain;

import java.util.Date;

class Flight {
    String flightNumber;
    String departure;   //Origen
    String destination; //Destino
    Date date;
    int seats;
    int availableSeats;

    public Flight(String flightNumber, String departure, String destination, Date date, int seats) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.seats = seats;
        this.availableSeats = seats;
    }

    public boolean bookFlight() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Departure: " + departure + ", Destination: " + destination + ", Date: " + date + ", Available Seats: " + availableSeats;
    }
}
