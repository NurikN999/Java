package AircraftTicketProject.AdminPanel.Add;

import AircraftTicketProject.AdminPanel.AdminMain;
import AircraftTicketProject.AdminPanel.MainFrame;
import AircraftTicketProject.Classes.Aircraft;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAircraft extends JPanel {

    private JLabel name, model, businessClassCapacity, economyClassCapacity;
    private JTextField nameField, modelField, businessField, economyField;
    private JButton add, back;

    public AddAircraft(MainFrame parent){

        setSize(800,600);
        setLayout(null);

        name = new JLabel("AIRCRAFT NAME: ");
        name.setSize(150,30);
        name.setLocation(250,150);
        add(name);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,150);
        add(nameField);

        model = new JLabel("MODEL NAME: ");
        model.setSize(150,30);
        model.setLocation(250,200);
        add(model);

        modelField = new JTextField();
        modelField.setSize(150,30);
        modelField.setLocation(400,200);
        add(modelField);

        businessClassCapacity = new JLabel("BUSINESS CLASS: ");
        businessClassCapacity.setSize(150,30);
        businessClassCapacity.setLocation(250,250);
        add(businessClassCapacity);

        businessField = new JTextField();
        businessField.setSize(150,30);
        businessField.setLocation(400,250);
        add(businessField);

        economyClassCapacity = new JLabel("ECONOMY CLASS: ");
        economyClassCapacity.setSize(150,30);
        economyClassCapacity.setLocation(250,300);
        add(economyClassCapacity);

        economyField = new JTextField();
        economyField.setSize(150,30);
        economyField.setLocation(400,300);
        add(economyField);

        add = new JButton("ADD AIRCRAFT");
        add.setSize(140,30);
        add.setLocation(250,350);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String model = modelField.getText();
                int business_capacity = Integer.parseInt(businessField.getText());
                int economy_capacity = Integer.parseInt(economyField.getText());

                AdminMain.addAircraft(
                        new Aircraft(
                                null,
                                name,
                                model,
                                business_capacity,
                                economy_capacity
                        )
                );
            }
        });

        back = new JButton("BACK");
        back.setSize(140,30);
        back.setLocation(400,350);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.addAircraft.setVisible(false);
                parent.createPanel.setVisible(true);
            }
        });

    }

}
