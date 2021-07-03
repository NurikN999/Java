package AircraftTicketProject.AdminPanel.Remove;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Aircraft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveAircraft extends JPanel {

    private JLabel aircraftLabel;
    private JComboBox aircraftComboBox;
    private Aircraft[] aircraft = {};
    private JButton remove, back;

    public RemoveAircraft(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        aircraftLabel = new JLabel("AIRCRAFT: ");
        aircraftLabel.setSize(150,30);
        aircraftLabel.setLocation(250,150);
        add(aircraftLabel);

        aircraftComboBox = new JComboBox(aircraft);
        aircraftComboBox.setSize(150,30);
        aircraftComboBox.setLocation(400,150);
        add(aircraftComboBox);

        remove = new JButton("REMOVE");
        remove.setSize(140,30);
        remove.setLocation(250,250);
        add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aircraft removeAircraft = (Aircraft) aircraftComboBox.getSelectedItem();
                AdminMain.removeAircraft(removeAircraft);

                aircraftComboBox.setSelectedIndex(0);
            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,250);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removePanel.setVisible(true);
            }
        });

    }

    public void updateAircraft(ArrayList<Aircraft> aircrafts){

        aircraftComboBox.removeAllItems();
        for (Aircraft a: aircrafts) {
            aircraftComboBox.addItem(a);
        }

    }
}
