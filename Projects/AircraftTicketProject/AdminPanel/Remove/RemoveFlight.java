package AircraftTicketProject.AdminPanel.Remove;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Flights;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveFlight extends JPanel {

    private JLabel flightLabel;
    private JComboBox flightComboBox;
    private Flights flights[] = {};
    private JButton remove, back;

    public RemoveFlight(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        flightLabel = new JLabel("FLIGHT: ");
        flightLabel.setSize(150,30);
        flightLabel.setLocation(250,150);
        add(flightLabel);

        flightComboBox = new JComboBox(flights);
        flightComboBox.setSize(380,30);
        flightComboBox.setLocation(400,150);
        add(flightComboBox);

        remove = new JButton("REMOVE");
        remove.setSize(140,30);
        remove.setLocation(250,250);
        add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Flights removeFlight = (Flights) flightComboBox.getSelectedItem();

                AdminMain.removeFlight(removeFlight);

                flightComboBox.setSelectedIndex(0);
            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,250);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removeFlight.setVisible(false);
                parent.removePanel.setVisible(true);
            }
        });

    }

    public void updateFlights(ArrayList<Flights> flights){

        flightComboBox.removeAllItems();
        for (Flights f: flights) {
            flightComboBox.addItem(f);
        }

    }

}
