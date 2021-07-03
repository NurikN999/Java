package AircraftTicketProject.CashierPanel;

import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChangePanel extends JPanel {

    private JLabel ticketLabel, flightLabel, nameLabel, surnameLabel, passportNumberLabel, ticketTypeLabel;
    private JTextField nameField, surnameField, passportField, ticketField;
    private JComboBox ticketsComboBox, flightsComboBox;
    private Tickets tickets[] = {};
    private Flights flights[] = {};
    private JButton change, back;


    public ChangePanel(MainFrame parent){
        setSize(800,600);
        setLayout(null);

        ticketLabel = new JLabel("CHOOSE TICKET: ");
        ticketLabel.setSize(150,30);
        ticketLabel.setLocation(250,150);
        add(ticketLabel);

        ticketsComboBox = new JComboBox(tickets);
        ticketsComboBox.setSize(380,30);
        ticketsComboBox.setLocation(400,150);
        add(ticketsComboBox);

        flightLabel = new JLabel("CHOOSE FLIGHT: ");
        flightLabel.setSize(150,30);
        flightLabel.setLocation(250,200);
        add(flightLabel);

        flightsComboBox = new JComboBox(flights);
        flightsComboBox.setSize(380,30);
        flightsComboBox.setLocation(400,200);
        add(flightsComboBox);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setSize(150,30);
        nameLabel.setLocation(250,250);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,250);
        add(nameField);

        surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setSize(150,30);
        surnameLabel.setLocation(250,300);
        add(surnameLabel);

        surnameField = new JTextField();
        surnameField.setSize(150,30);
        surnameField.setLocation(400,300);
        add(surnameField);

        passportNumberLabel = new JLabel("PASSPORT NUMBER: ");
        passportNumberLabel.setSize(150,30);
        passportNumberLabel.setLocation(250,350);
        add(passportNumberLabel);

        passportField = new JTextField();
        passportField.setSize(150,30);
        passportField.setLocation(400,350);
        add(passportField);

        ticketTypeLabel = new JLabel("TICKET TYPE: ");
        ticketTypeLabel.setSize(150,30);
        ticketTypeLabel.setLocation(250,400);
        add(ticketTypeLabel);

        ticketField = new JTextField();
        ticketField.setSize(150,30);
        ticketField.setLocation(400,400);
        add(ticketField);

        change = new JButton("CHANGE");
        change.setSize(140,30);
        change.setLocation(250,500);
        add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tickets previousTicket = (Tickets)ticketsComboBox.getSelectedItem();
                Flights flight = (Flights) flightsComboBox.getSelectedItem();
                String name = nameField.getText();
                String surname = surnameField.getText();
                String passportNumber = passportField.getText();
                String ticketType = ticketField.getText();

                Tickets ticket = new Tickets(
                        previousTicket.getId(),
                        flight,
                        name,
                        surname,
                        passportNumber,
                        ticketType);


                CashierMain.changeTicket(ticket);

                ticketsComboBox.setSelectedIndex(0);
                flightsComboBox.setSelectedIndex(0);
                nameField.setText("");
                surnameField.setText("");
                passportField.setText("");
                ticketField.setText("");

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,500);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changePanel.setVisible(false);
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

    public void updateTickets(ArrayList<Tickets> tickets){

        ticketsComboBox.removeAllItems();
        for (Tickets ticket: tickets) {
            ticketsComboBox.addItem(ticket);
        }

    }
}
