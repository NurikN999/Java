package AircraftTicketProject;

import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {

    private String operationType;

    private City city;
    private ArrayList<City> cities;

    private Aircraft aircraft;
    private ArrayList<Aircraft> aircrafts;

    private Flights flight;
    private ArrayList<Flights> flights;

    private Tickets ticket;
    private ArrayList<Tickets> tickets;

    public PackageData(){

    }

    public PackageData(String operationType, City city, ArrayList<City> cities, Aircraft aircraft, ArrayList<Aircraft> aircrafts, Flights flight, ArrayList<Flights> flights, Tickets ticket, ArrayList<Tickets> tickets) {
        this.operationType = operationType;
        this.city = city;
        this.cities = cities;
        this.aircraft = aircraft;
        this.aircrafts = aircrafts;
        this.flight = flight;
        this.flights = flights;
        this.ticket = ticket;
        this.tickets = tickets;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(ArrayList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public ArrayList<Flights> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    public Tickets getTicket() {
        return ticket;
    }

    public void setTicket(Tickets ticket) {
        this.ticket = ticket;
    }

    public ArrayList<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Tickets> tickets) {
        this.tickets = tickets;
    }
}
