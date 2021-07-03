package AircraftTicketProject.AdminPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemovePanel extends JPanel {

    private JButton city, aircraft, flight, back;

    public RemovePanel(MainFrame parent){

        setLayout(null);
        setSize(800,600);

        city = new JButton("CITY");
        city.setSize(300,50);
        city.setLocation(250,150);
        add(city);
        city.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removeCity.updateCities(AdminMain.getCities());
                parent.removePanel.setVisible(false);
                parent.removeCity.setVisible(true);
            }
        });

        aircraft = new JButton("AIRCRAFT");
        aircraft.setSize(300,50);
        aircraft.setLocation(250,250);
        add(aircraft);
        aircraft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removeAircraft.updateAircraft(AdminMain.getAircraft());
                parent.removePanel.setVisible(false);
                parent.removeAircraft.setVisible(true);
            }
        });

        flight = new JButton("FLIGHT");
        flight.setSize(300,50);
        flight.setLocation(250,350);
        add(flight);
        flight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removeFlight.updateFlights(AdminMain.getFlights());
                parent.removePanel.setVisible(false);
                parent.removeFlight.setVisible(true);
            }
        });

        back = new JButton("BACK");
        back.setSize(300,30);
        back.setLocation(250, 450);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removePanel.setVisible(false);
                parent.mainMenu.setVisible(true);
            }
        });

    }

}

