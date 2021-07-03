package AircraftTicketProject.Classes;

import java.io.Serializable;

public class Tickets implements Serializable {

    private Long id;
    private Flights flight;
    private String name, surname, passport_number, ticket_type;

    public Tickets(Long id, Flights flight, String name, String surname, String passport_number, String ticket_type) {
        this.id = id;
        this.flight = flight;
        this.name = name;
        this.surname = surname;
        this.passport_number = passport_number;
        this.ticket_type = ticket_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    @Override
    public String toString() {
        return  name + " " + surname + " " + passport_number + " " + ticket_type + " " + flight;
    }
}
