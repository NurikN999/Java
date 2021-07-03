package AircraftTicketProject.AdminPanel.Change;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChangeFlight extends JPanel {

    private JLabel previousFlight,aircraftId, departureCityId, arrivalCityId, departureTime, economyClassPrice, businessClassPrice;
    private JComboBox flightsCombo, aircraft, departureCity, arrivalCity;
    private JTextField departureTimeField, economyField, businessField;
    private City[] cities = {};
    private Aircraft[] aircrafts = {};
    private Flights[] flights = {};
    private JButton change, back;


    public ChangeFlight(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        previousFlight = new JLabel("PREVIOUS FLIGHT: ");
        previousFlight.setSize(150,30);
        previousFlight.setLocation(250,150);
        add(previousFlight);

        flightsCombo = new JComboBox(flights);
        flightsCombo.setSize(380,30);
        flightsCombo.setLocation(400,150);
        add(flightsCombo);

        aircraftId = new JLabel("NEW AIRCRAFT: ");
        aircraftId.setSize(150,30);
        aircraftId.setLocation(250,200);
        add(aircraftId);

        aircraft = new JComboBox(aircrafts);
        aircraft.setSize(150,30);
        aircraft.setLocation(400,200);
        add(aircraft);

        departureCityId = new JLabel("DEPARTURE CITY: ");
        departureCityId.setSize(150,30);
        departureCityId.setLocation(250,250);
        add(departureCityId);

        departureCity = new JComboBox(cities);
        departureCity.setSize(150,30);
        departureCity.setLocation(400,250);
        add(departureCity);

        arrivalCityId = new JLabel("ARRIVAL CITY: ");
        arrivalCityId.setSize(150,30);
        arrivalCityId.setLocation(250,300);
        add(arrivalCityId);

        arrivalCity = new JComboBox(cities);
        arrivalCity.setSize(150,30);
        arrivalCity.setLocation(400,300);
        add(arrivalCity);

        departureTime = new JLabel("DEPARTURE TIME: ");
        departureTime.setSize(150,30);
        departureTime.setLocation(250,350);
        add(departureTime);

        departureTimeField = new JTextField();
        departureTimeField.setSize(150,30);
        departureTimeField.setLocation(400,350);
        add(departureTimeField);

        economyClassPrice = new JLabel("ECONOMY CLASS PRICE: ");
        economyClassPrice.setSize(150,30);
        economyClassPrice.setLocation(250,400);
        add(economyClassPrice);

        economyField = new JTextField();
        economyField.setSize(150,30);
        economyField.setLocation(400,400);
        add(economyField);

        businessClassPrice = new JLabel("BUSINESS CLASS PRICE: ");
        businessClassPrice.setSize(150,30);
        businessClassPrice.setLocation(250,450);
        add(businessClassPrice);

        businessField = new JTextField();
        businessField.setSize(150,30);
        businessField.setLocation(400,450);
        add(businessField);

        change = new JButton("APPLY CHANGES");
        change.setSize(140,30);
        change.setLocation(250,500);
        add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Aircraft newAircraft = (Aircraft) aircraft.getSelectedItem();
                City newDepartureCity = (City) departureCity.getSelectedItem();
                City newArrivalCity = (City) arrivalCity.getSelectedItem();
                String newDepartureTime = departureTimeField.getText();
                int economyPrice = Integer.parseInt(economyField.getText());
                int businessPrice = Integer.parseInt(businessField.getText());

                Flights previousFlight = (Flights) flightsCombo.getSelectedItem();
                Long id = previousFlight.getId();


                Flights flight = new Flights(id,newAircraft, newDepartureCity, newArrivalCity,newDepartureTime, economyPrice, businessPrice);
                AdminMain.changeFlight(flight);

                aircraft.setSelectedIndex(0);
                departureCity.setSelectedIndex(0);
                arrivalCity.setSelectedIndex(0);
                departureTimeField.setText("");
                economyField.setText("");
                businessField.setText("");

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,500);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeFlight.setVisible(false);
                parent.changePanel.setVisible(true);
            }
        });

    }


    public void updateFlights(ArrayList<Flights> flights){

        flightsCombo.removeAllItems();
        for (Flights f: flights) {
            flightsCombo.addItem(f);
        }

    }

    public void updateAircraft(ArrayList<Aircraft> aircrafts){

        aircraft.removeAllItems();
        for (Aircraft a: aircrafts) {
            aircraft.addItem(a);
        }

    }

    public void updateCities(ArrayList<City> cities){

        departureCity.removeAllItems();
        arrivalCity.removeAllItems();
        for (City c: cities) {
            departureCity.addItem(c);
            arrivalCity.addItem(c);
        }

    }

}
