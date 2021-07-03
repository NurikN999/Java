package AircraftTicketProject;

import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{

    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){

        try{

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData data;

            while((data = (PackageData) inputStream.readObject()) != null){

                if(data.getOperationType().equals("ADD_CITY")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.addCity(data.getCity());

                    PackageData response = new PackageData();
                    response.setOperationType("CITY_ADDED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("CHANGE_CITY")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.changeCity(data.getCity());

                    PackageData response = new PackageData();
                    response.setOperationType("CITY_CHANGED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("REMOVE_CITY")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.removeCity(data.getCity());

                    PackageData response = new PackageData();
                    response.setOperationType("CITY_REMOVED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("LIST_CITIES")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    ArrayList<City> cities = MainServer.getCities();

                    PackageData response = new PackageData();
                    response.setOperationType("CITIES_LIST");
                    response.setCities(cities);

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("ADD_AIRCRAFT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.addAircraft(data.getAircraft());

                    PackageData response = new PackageData();
                    response.setOperationType("AIRCRAFT_ADDED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("CHANGE_AIRCRAFT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.changeAircraft(data.getAircraft());

                    PackageData response = new PackageData();
                    response.setOperationType("AIRCRAFT_CHANGED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("REMOVE_AIRCRAFT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.removeAircraft(data.getAircraft());

                    PackageData response = new PackageData();
                    response.setOperationType("AIRCRAFT_REMOVED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("LIST_AIRCRAFT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    ArrayList<Aircraft> aircrafts = MainServer.getAircrafts();

                    PackageData response = new PackageData();
                    response.setOperationType("AIRCRAFT_LIST");
                    response.setAircrafts(aircrafts);

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("ADD_FLIGHT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.addFlight(data.getFlight());

                    PackageData response = new PackageData();
                    response.setOperationType("FLIGHT_ADDED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("CHANGE_FLIGHT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.changeFlight(data.getFlight());

                    PackageData response = new PackageData();
                    response.setOperationType("FLIGHT_CHANGED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("REMOVE_FLIGHT")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.removeFlight(data.getFlight());

                    PackageData response = new PackageData();
                    response.setOperationType("FLIGHT_REMOVED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("LIST_FLIGHTS")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    ArrayList<Flights> flights = MainServer.getFlights();

                    PackageData response = new PackageData();
                    response.setOperationType("FLIGHTS_LISTED");
                    response.setFlights(flights);

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("ADD_TICKET")){
                    System.out.println("FROM CLIENT: " + data.getOperationType());
                    MainServer.addTicket(data.getTicket());

                    PackageData response = new PackageData();
                    response.setOperationType("TICKET_ADDED");

                    outputStream.writeObject(response);
                }else if(data.getOperationType().equals("CHANGE_TICKET")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.changeTicket(data.getTicket());

                    PackageData response = new PackageData();
                    response.setOperationType("TICKET_CHANGED");

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("LIST_TICKETS")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    ArrayList<Tickets> tickets = MainServer.getTickets();

                    PackageData response = new PackageData();
                    response.setOperationType("FLIGHTS_LISTED");
                    response.setTickets(tickets);

                    outputStream.writeObject(response);

                }else if(data.getOperationType().equals("REMOVE_TICKET")){

                    System.out.println("FROM CLIENT " + data.getOperationType());
                    MainServer.removeTicket(data.getTicket());

                    PackageData response = new PackageData();
                    response.setOperationType("TICKET_REMOVED");

                    outputStream.writeObject(response);

                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
