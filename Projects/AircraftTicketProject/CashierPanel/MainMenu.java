package AircraftTicketProject.CashierPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private JButton create, change, remove;

    public MainMenu(MainFrame parent){

        setLayout(null);
        setSize(800,600);

        create = new JButton("CREATE");
        create.setSize(300,50);
        create.setLocation(250,150);
        add(create);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.createPanel.updateFlights(CashierMain.getFlights());
                parent.mainMenu.setVisible(false);
                parent.createPanel.setVisible(true);
            }
        });

        change = new JButton("CHANGE");
        change.setSize(300,50);
        change.setLocation(250,250);
        add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.changePanel.updateFlights(CashierMain.getFlights());
                parent.changePanel.updateTickets(CashierMain.getTickets());
                parent.mainMenu.setVisible(false);
                parent.changePanel.setVisible(true);
            }
        });

        remove = new JButton("REMOVE");
        remove.setSize(300,50);
        remove.setLocation(250,350);
        add(remove);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.removePanel.updateTickets(CashierMain.getTickets());
                parent.mainMenu.setVisible(false);
                parent.removePanel.setVisible(true);
            }
        });

    }

}
