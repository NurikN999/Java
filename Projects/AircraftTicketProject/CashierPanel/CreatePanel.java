package AircraftTicketProject.CashierPanel;

import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CreatePanel extends JPanel {

    private JLabel flightLabel, nameLabel, surnameLabel, passportNumberLabel, ticketTypeLabel;
    private JComboBox flightsComboBox;
    private JTextField nameField, surnameField, passportField, ticketField;
    private Flights flights[] = {};
    private JButton add, back;

    public CreatePanel(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        flightLabel = new JLabel("CHOOSE FLIGHT: ");
        flightLabel.setSize(150,30);
        flightLabel.setLocation(250,150);
        add(flightLabel);

        flightsComboBox = new JComboBox(flights);
        flightsComboBox.setSize(380,30);
        flightsComboBox.setLocation(400,150);
        add(flightsComboBox);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setSize(150,30);
        nameLabel.setLocation(250,200);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,200);
        add(nameField);

        surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setSize(150,30);
        surnameLabel.setLocation(250,250);
        add(surnameLabel);

        surnameField = new JTextField();
        surnameField.setSize(150,30);
        surnameField.setLocation(400,250);
        add(surnameField);

        passportNumberLabel = new JLabel("PASSPORT NUMBER: ");
        passportNumberLabel.setSize(150,30);
        passportNumberLabel.setLocation(250,300);
        add(passportNumberLabel);

        passportField = new JTextField();
        passportField.setSize(150,30);
        passportField.setLocation(400,300);
        add(passportField);

        ticketTypeLabel = new JLabel("TICKET TYPE: ");
        ticketTypeLabel.setSize(150,30);
        ticketTypeLabel.setLocation(250,350);
        add(ticketTypeLabel);

        ticketField = new JTextField();
        ticketField.setSize(150,30);
        ticketField.setLocation(400,350);
        add(ticketField);

        add = new JButton("ADD");
        add.setSize(140,30);
        add.setLocation(250,450);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Flights flight = (Flights) flightsComboBox.getSelectedItem();
                String name = nameField.getText();
                String surname = surnameField.getText();
                String passportNumber = passportField.getText();
                String ticketType = ticketField.getText();

                Tickets ticket = new Tickets(
                        null,
                        flight,
                        name,
                        surname,
                        passportNumber,
                        ticketType);


                CashierMain.addTicket(ticket);

                flightsComboBox.setSelectedIndex(0);
                nameField.setText("");
                surnameField.setText("");
                passportField.setText("");
                ticketField.setText("");

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,450);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.createPanel.setVisible(false);
                parent.mainMenu.setVisible(true);
            }
        });

    }

    public void updateFlights(ArrayList<Flights> flights){

        flightsComboBox.removeAllItems();
        for (Flights f: flights) {
            flightsComboBox.addItem(f);
        }

    }
}
