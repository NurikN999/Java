package AircraftTicketProject.AdminPanel.Remove;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.City;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveCity extends JPanel {

    private JLabel cityLabel;
    private JComboBox citiesComboBox;
    private City[] cities = {};

    private JButton removeButton, back;

    public RemoveCity(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        cityLabel = new JLabel("WHICH CITY?: ");
        cityLabel.setSize(150,30);
        cityLabel.setLocation(250,150);
        add(cityLabel);

        citiesComboBox = new JComboBox(cities);
        citiesComboBox.setSize(150,30);
        citiesComboBox.setLocation(400,150);
        add(citiesComboBox);

        removeButton = new JButton("REMOVE");
        removeButton.setSize(140,30);
        removeButton.setLocation(250,200);
        add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                City removeCity = (City) citiesComboBox.getSelectedItem();
                AdminMain.removeCity(removeCity);

                citiesComboBox.setSelectedIndex(0);
            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,200);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removeCity.setVisible(false);
                parent.removePanel.setVisible(false);
            }
        });
    }

    public void updateCities(ArrayList<City> cities){

        citiesComboBox.removeAllItems();
        for (City city: cities) {
            citiesComboBox.addItem(city);
        }

    }

}
