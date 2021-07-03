package AircraftTicketProject.AdminPanel.Add;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.City;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCityPage extends JPanel {

    private JLabel nameLabel, countryLabel ,codeLabel;
    private JTextField nameField, countryField, codeField;
    private JButton addButton, backButton;

    public AddCityPage(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        nameLabel = new JLabel("CITY NAME: ");
        nameLabel.setSize(150,30);
        nameLabel.setLocation(250, 200);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,200);
        add(nameField);

        countryLabel = new JLabel("COUNTRY NAME: ");
        countryLabel.setSize(150,30);
        countryLabel.setLocation(250,250);
        add(countryLabel);

        countryField = new JTextField();
        countryField.setSize(150,30);
        countryField.setLocation(400,250);
        add(countryField);

        codeLabel = new JLabel("CODE: ");
        codeLabel.setSize(150,30);
        codeLabel.setLocation(250,300);
        add(codeLabel);

        codeField = new JTextField();
        codeField.setSize(150,30);
        codeField.setLocation(400,300);
        add(codeField);

        addButton = new JButton("ADD CITY");
        addButton.setSize(140,30);
        addButton.setLocation(250,400);
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String country = countryField.getText();
                String code = codeField.getText();

                City city = new City(null,name, country, code);
                AdminMain.addCity(city);

                nameField.setText("");
                countryField.setText("");
                codeField.setText("");
            }
        });

        backButton = new JButton("BACK");
        backButton.setSize(140,30);
        backButton.setLocation(400,400);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.addCityPage.setVisible(false);
                parent.createPanel.setVisible(true);
            }
        });

    }

}
