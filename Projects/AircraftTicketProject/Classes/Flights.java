package AircraftTicketProject.Classes;

import java.io.Serializable;

public class Flights implements Serializable {

    private Long id;
    private Aircraft aircraft;
    private City departure_city, arrival_city;
    private String departureTime;
    private int economy_place_price, business_place_price;

    public Flights(Long id, Aircraft aircraft, City departure_city, City arrival_city, String departureTime, int economy_place_price, int business_place_price) {
        this.id = id;
        this.aircraft = aircraft;
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
        this.departureTime = departureTime;
        this.economy_place_price = economy_place_price;
        this.business_place_price = business_place_price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public City getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(City departure_city) {
        this.departure_city = departure_city;
    }

    public City getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(City arrival_city) {
        this.arrival_city = arrival_city;
    }

    public int getEconomy_place_price() {
        return economy_place_price;
    }

    public void setEconomy_place_price(int economy_place_price) {
        this.economy_place_price = economy_place_price;
    }

    public int getBusiness_place_price() {
        return business_place_price;
    }

    public void setBusiness_place_price(int business_place_price) {
        this.business_place_price = business_place_price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String toString(){
        return getAircraft() + " " + getDeparture_city() + " " + getArrival_city() + " " + getDepartureTime() + " " + getEconomy_place_price() + " " + getBusiness_place_price();
    }
}
