package AircraftTicketProject.AdminPanel.Change;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Aircraft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChangeAircraft extends JPanel {

    private JLabel chooseAircraft, changedName, changedModel, changedBusinessCapacity, changedEconomyCapacity;
    private JTextField nameField, modelField, businessField, economyField;
    private JComboBox aircraft;
    private JButton change, back;
    private Aircraft[] aircrafts = {};

    public ChangeAircraft(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        chooseAircraft = new JLabel("CHOOSE AIRCRAFT: ");
        chooseAircraft.setSize(150,30);
        chooseAircraft.setLocation(250, 150);
        add(chooseAircraft);

        aircraft = new JComboBox(aircrafts);
        aircraft.setSize(150,30);
        aircraft.setLocation(400,150);
        add(aircraft);

        changedName = new JLabel("NAME: ");
        changedName.setSize(150,30);
        changedName.setLocation(250,200);
        add(changedName);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,200);
        add(nameField);

        changedModel = new JLabel("MODEL: ");
        changedModel.setSize(150,30);
        changedModel.setLocation(250,250);
        add(changedModel);

        modelField = new JTextField();
        modelField.setSize(150,30);
        modelField.setLocation(400,250);
        add(modelField);

        changedBusinessCapacity = new JLabel("BUSINESS CLASS CAPACITY: ");
        changedBusinessCapacity.setSize(150,30);
        changedBusinessCapacity.setLocation(250,300);
        add(changedBusinessCapacity);

        businessField = new JTextField();
        businessField.setSize(150,30);
        businessField.setLocation(400,300);
        add(businessField);

        changedEconomyCapacity = new JLabel("ECONOMY CLASS CAPACITY: ");
        changedEconomyCapacity.setSize(150,30);
        changedEconomyCapacity.setLocation(250,350);
        add(changedEconomyCapacity);

        economyField = new JTextField();
        economyField.setSize(150,30);
        economyField.setLocation(400,350);
        add(economyField);

        change = new JButton("APPLY CHANGE");
        change.setSize(140,30);
        change.setLocation(250,450);
        add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Aircraft a = (Aircraft) aircraft.getSelectedItem();

                Long id = a.getId();
                String name = nameField.getText();
                String model = modelField.getText();
                int business_capacity = Integer.parseInt(businessField.getText());
                int economy_capacity = Integer.parseInt(economyField.getText());

                Aircraft newAircraft = new Aircraft(id, name, model, business_capacity, economy_capacity);
                AdminMain.changeAircraft(newAircraft);

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(450,450);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changeAircraft.setVisible(false);
                parent.changePanel.setVisible(true);
            }
        });

    }

    public void updateAircraft(ArrayList<Aircraft> aircrafts){

        aircraft.removeAllItems();
        for (Aircraft a: aircrafts) {
            aircraft.addItem(a);
        }

    }

}


