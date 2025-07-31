package com.example.Model;

public class BookingModel {
    private int bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int noOfPassengers;
    private String roundTrip;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticetClass) {
        this.ticketClass = ticetClass;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
    }

    // Default constructor
    public BookingModel() {
    }

    // Parameterized constructor
    public BookingModel(int bookingId, String source, String destination, String ticketClass,
                        int noOfPassengers, String roundTrip) {
        this.bookingId = bookingId;
        this.source = source;
        this.destination = destination;
        this.ticketClass = ticketClass;
        this.noOfPassengers = noOfPassengers;
        this.roundTrip = roundTrip;

    }
    @Override
    public String toString() {
        return "BookingModel{" +
                "bookingId=" + bookingId +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketClass='" + ticketClass + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", roundTrip=" + roundTrip +
                '}';
    }

}
