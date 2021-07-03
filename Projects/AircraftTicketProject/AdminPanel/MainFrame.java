package AircraftTicketProject.AdminPanel;

import AircraftTicketProject.AdminPanel.Add.AddAircraft;
import AircraftTicketProject.AdminPanel.Add.AddCityPage;
import AircraftTicketProject.AdminPanel.Add.AddFlight;
import AircraftTicketProject.AdminPanel.Change.ChangeAircraft;
import AircraftTicketProject.AdminPanel.Change.ChangeCityPage;
import AircraftTicketProject.AdminPanel.Change.ChangeFlight;
import AircraftTicketProject.AdminPanel.Remove.RemoveAircraft;
import AircraftTicketProject.AdminPanel.Remove.RemoveCity;
import AircraftTicketProject.AdminPanel.Remove.RemoveFlight;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainMenu mainMenu;
    public CreatePanel createPanel;
    public ChangePanel changePanel;
    public RemovePanel removePanel;
    public AddCityPage addCityPage;
    public AddAircraft addAircraft;
    public AddFlight addFlight;

    public ChangeAircraft changeAircraft;
    public ChangeCityPage changeCityPage;
    public ChangeFlight changeFlight;

    public RemoveCity removeCity;
    public RemoveAircraft removeAircraft;
    public RemoveFlight removeFlight;

    public MainFrame(){

        setTitle("Administrator Panel");
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

        addCityPage = new AddCityPage(this);
        addCityPage.setVisible(false);
        add(addCityPage);

        addAircraft = new AddAircraft(this);
        addAircraft.setVisible(false);
        add(addAircraft);

        addFlight = new AddFlight(this);
        addFlight.setVisible(false);
        add(addFlight);

        changeAircraft = new ChangeAircraft(this);
        changeAircraft.setVisible(false);
        add(changeAircraft);

        changeCityPage = new ChangeCityPage(this);
        changeCityPage.setVisible(false);
        add(changeCityPage);

        changeFlight = new ChangeFlight(this);
        changeFlight.setVisible(false);
        add(changeFlight);

        removeCity = new RemoveCity(this);
        removeCity.setVisible(false);
        add(removeCity);

        removeAircraft = new RemoveAircraft(this);
        removeAircraft.setVisible(false);
        add(removeAircraft);

        removeFlight = new RemoveFlight(this);
        removeFlight.setVisible(false);
        add(removeFlight);

    }

}
