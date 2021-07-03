package AircraftTicketProject.CashierPanel;


import javax.swing.*;

public class MainFrame extends JFrame {

    public MainMenu mainMenu;
    public CreatePanel createPanel;
    public ChangePanel changePanel;
    public RemovePanel removePanel;

    public MainFrame(){

        setTitle("Cashier Panel");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        createPanel = new CreatePanel(this);
        createPanel.setVisible(false);
        add(createPanel);

        changePanel = new ChangePanel(this);
        changePanel.setVisible(false);
        add(changePanel);

        removePanel = new RemovePanel(this);
        removePanel.setVisible(false);
        add(removePanel);



    }

}
