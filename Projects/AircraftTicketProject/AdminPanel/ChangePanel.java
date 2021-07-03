package AircraftTicketProject.AdminPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePanel extends JPanel {

    private JButton city, aircraft, flight, back;

    public ChangePanel(MainFrame parent){

        setLayout(null);
        setSize(800,600);

        city = new JButton("CITY");
        city.setSize(300,50);
        city.setLocation(250,150);
        add(city);
        city.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeCityPage.updateCities(AdminMain.getCities());
                parent.changePanel.setVisible(false);
                parent.changeCityPage.setVisible(true);
            }
        });

        aircraft = new JButton("AIRCRAFT");
        aircraft.setSize(300,50);
        aircraft.setLocation(250,250);
        add(aircraft);
        aircraft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeAircraft.updateAircraft(AdminMain.getAircraft());
                parent.changePanel.setVisible(false);
                parent.changeAircraft.setVisible(true);
            }
        });

        flight = new JButton("FLIGHT");
        flight.setSize(300,50);
        flight.setLocation(250,350);
        add(flight);
        flight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeFlight.updateFlights(AdminMain.getFlights());
                parent.changeFlight.updateAircraft(AdminMain.getAircraft());
                parent.changeFlight.updateCities(AdminMain.getCities());
                parent.changePanel.setVisible(false);
                parent.changeFlight.setVisible(true);
            }
        });

        back = new JButton("BACK");
        back.setSize(300,30);
        back.setLocation(250, 450);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changePanel.setVisible(false);
                parent.mainMenu.setVisible(true);
            }
        });

    }

}

