package AircraftTicketProject.CashierPanel;

import AircraftTicketProject.Classes.Tickets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemovePanel extends JPanel {

    private JLabel ticketLabel;
    private JComboBox ticketsComboBox;
    private Tickets tickets[] = {};
    private JButton remove, back;

    public RemovePanel(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        ticketLabel = new JLabel("TICKETS: ");
        ticketLabel.setSize(150,30);
        ticketLabel.setLocation(250,200);
        add(ticketLabel);

        ticketsComboBox = new JComboBox(tickets);
        ticketsComboBox.setSize(380,30);
        ticketsComboBox.setLocation(400,200);
        add(ticketsComboBox);

        remove = new JButton("REMOVE");
        remove.setSize(140,30);
        remove.setLocation(250,300);
        add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tickets ticket = (Tickets) ticketsComboBox.getSelectedItem();

                System.out.println(ticket);
                CashierMain.removeTicket(ticket);

                ticketsComboBox.setSelectedIndex(0);

            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,300);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removePanel.setVisible(false);
                parent.mainMenu.setVisible(true);
            }
        });


    }
    public void updateTickets(ArrayList<Tickets> tickets){

        ticketsComboBox.removeAllItems();
        for (Tickets ticket: tickets) {
            ticketsComboBox.addItem(ticket);
        }

    }

}
