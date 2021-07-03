package AircraftTicketProject.AdminPanel.Change;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.City;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChangeCityPage extends JPanel {

    private JLabel previousCity, name, country, short_name;
    private JTextField nameField, countryField, Short_nameField;
    private JComboBox citiesCombo;
    private City[] citiesArr = {};
    private JButton change, back;

    public ChangeCityPage(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        previousCity = new JLabel("PREVIOUS CITY: ");
        previousCity.setSize(150,30);
        previousCity.setLocation(250,150);
        add(previousCity);

        citiesCombo = new JComboBox(citiesArr);
        citiesCombo.setSize(150,30);
        citiesCombo.setLocation(400,150);
        add(citiesCombo);

        name = new JLabel("NEW NAME: ");
        name.setSize(1510,30);
        name.setLocation(250,200);
        add(name);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,200);
        add(nameField);

        country = new JLabel("NEW COUNTRY");
        country.setSize(150,30);
        country.setLocation(250,250);
        add(country);

        countryField = new JTextField();
        countryField.setSize(150,30);
        countryField.setLocation(400,250);
        add(countryField);

        short_name = new JLabel("NEW SHORT NAME: ");
        short_name.setSize(150,30);
        short_name.setLocation(250,300);
        add(short_name);

        Short_nameField = new JTextField();
        Short_nameField.setSize(150,30);
        Short_nameField.setLocation(400,300);
        add(Short_nameField);

        change = new JButton("APPLY CHANGES");
        change.setSize(140,30);
        change.setLocation(250,400);
        add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                City city = (City) citiesCombo.getSelectedItem();

                Long id = city.getId();
                String name = nameField.getText();
                String country = countryField.getText();
                String short_name = Short_nameField.getText();

                City newCity = new City(id, name, country, short_name);
                AdminMain.changeCity(newCity);

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeCityPage.setVisible(false);
                parent.changePanel.setVisible(true);
            }
        });

    }


    public void updateCities(ArrayList<City> cities){

        citiesCombo.removeAllItems();
        for (City c: cities) {
            citiesCombo.addItem(c);
        }

    }

}
