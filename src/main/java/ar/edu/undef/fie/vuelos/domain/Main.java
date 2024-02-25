package ar.edu.undef.fie.vuelos.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("Airline Name");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("1. Schedule a flight");
            System.out.println("2. Make a booking");
            System.out.println("3. Display flight information");
            System.out.println("4. List available flights");
            System.out.println("5. Show passenger bookings");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Schedule a flight
                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter departure location: ");
                    String departure = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter date (dd/MM/yyyy): ");
                    Date date = null;
                    try {
                        date = format.parse(scanner.nextLine());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("Enter number of seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Flight flight = new Flight(flightNumber, departure, destination, date, seats);
                    airline.addFlight(flight);
                    break;
                case 2:
                    // Make a booking
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter passport number: ");
                    String passportNumber = scanner.nextLine();
                    System.out.print("Enter flight number: ");
                    flightNumber = scanner.nextLine();
                    Passenger passenger = new Passenger(name, passportNumber);
                    if (airline.bookFlight(flightNumber, passenger)) {
                        System.out.println("Booking successful");
                    } else {
                        System.out.println("Booking failed");
                    }
                    break;
                case 3:
                    // Display flight information
                    System.out.print("Enter flight number: ");
                    flightNumber = scanner.nextLine();
                    flight = airline.getFlight(flightNumber);
                    if (flight != null) {
                        System.out.println(flight);
                    } else {
                        System.out.println("Flight not found");
                    }
                    break;
                case 4:
                    // List available flights
                    List<Flight> availableFlights = airline.getAvailableFlights();
                    for (Flight availableFlight : availableFlights) {
                        System.out.println(availableFlight);
                    }
                    break;
                case 5:
                    // Show passenger bookings
                    System.out.print("Enter passenger name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter passport number: ");
                    passportNumber = scanner.nextLine();
                    passenger = new Passenger(name, passportNumber);
                    List<Flight> bookings = passenger.getBookings();
                    for (Flight booking : bookings) {
                        System.out.println(booking);
                    }
                    break;
                case 6:
                    // Exit
                    System.exit(0);
            }
        }
    }
}