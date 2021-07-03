package AircraftTicketProject.AdminPanel.Add;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddFlight extends JPanel {

    private JLabel aircraftId, departureCityId, arrivalCityId, departureTime, economyClassPrice, businessClassPrice;
    private JComboBox aircraft, departureCity, arrivalCity;
    private JTextField departureTimeField, economyField, businessField;
    private City[] cities = {};
    private Aircraft[] aircrafts = {};
    private JButton addButton, backButton;

    public AddFlight(MainFrame parent){


        setSize(800,600);
        setLayout(null);

        aircraftId = new JLabel("AIRCRAFT: ");
        aircraftId.setSize(150,30);
        aircraftId.setLocation(250,150);
        add(aircraftId);

        aircraft = new JComboBox(aircrafts);
        aircraft.setSize(150,30);
        aircraft.setLocation(400,150);
        add(aircraft);

        departureCityId = new JLabel("DEPARTURE CITY: ");
        departureCityId.setSize(150,30);
        departureCityId.setLocation(250,200);
        add(departureCityId);

        departureCity = new JComboBox(cities);
        departureCity.setSize(150,30);
        departureCity.setLocation(400,200);
        add(departureCity);

        arrivalCityId = new JLabel("ARRIVAL CITY: ");
        arrivalCityId.setSize(150,30);
        arrivalCityId.setLocation(250,250);
        add(arrivalCityId);

        arrivalCity = new JComboBox(cities);
        arrivalCity.setSize(150,30);
        arrivalCity.setLocation(400,250);
        add(arrivalCity);

        departureTime = new JLabel("DEPARTURE TIME: ");
        departureTime.setSize(150,30);
        departureTime.setLocation(250,300);
        add(departureTime);

        departureTimeField = new JTextField();
        departureTimeField.setSize(150,30);
        departureTimeField.setLocation(400,300);
        add(departureTimeField);

        economyClassPrice = new JLabel("ECONOMY CLASS PRICE: ");
        economyClassPrice.setSize(150,30);
        economyClassPrice.setLocation(250,350);
        add(economyClassPrice);

        economyField = new JTextField();
        economyField.setSize(150,30);
        economyField.setLocation(400,350);
        add(economyField);

        businessClassPrice = new JLabel("BUSINESS CLASS PRICE: ");
        businessClassPrice.setSize(150,30);
        businessClassPrice.setLocation(250,400);
        add(businessClassPrice);

        businessField = new JTextField();
        businessField.setSize(150,30);
        businessField.setLocation(400,400);
        add(businessField);

        addButton = new JButton("ADD");
        addButton.setSize(140,30);
        addButton.setLocation(250,450);
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Aircraft aircraftObj = (Aircraft) aircraft.getSelectedItem();
                City departureObj = (City) departureCity.getSelectedItem();
                City arrivalObj = (City) arrivalCity.getSelectedItem();


                String departureTime = departureTimeField.getText();
                int economyClassPrice = Integer.parseInt(economyField.getText());
                int businessClassPrice = Integer.parseInt(businessField.getText());

                Flights flight = new Flights(
                        null,
                        aircraftObj,
                        departureObj,
                        arrivalObj,
                        departureTime,
                        economyClassPrice,
                        businessClassPrice
                );

                AdminMain.addFlight(flight);

                aircraft.setSelectedIndex(0);
                departureCity.setSelectedIndex(0);
                arrivalCity.setSelectedIndex(0);
                departureTimeField.setText("");
                economyField.setText("");
                businessField.setText("");

            }
        });

        backButton = new JButton("BACK");
        backButton.setSize(140,30);
        backButton.setLocation(400,450);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.addFlight.setVisible(false);
                parent.createPanel.setVisible(true);
            }
        });

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
