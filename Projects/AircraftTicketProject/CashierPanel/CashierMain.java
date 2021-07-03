package AircraftTicketProject.CashierPanel;

import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;
import AircraftTicketProject.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class CashierMain {

    private static Socket socket;
    private static ObjectOutputStream outputStream;
    private static ObjectInputStream inputStream;

    public static void main(String[] args) {

        try{

            socket = new Socket("127.0.0.1",1843);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());

        }catch (Exception e){
            e.printStackTrace();
        }

       MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

    }

    public static ArrayList<Flights> getFlights(){
        ArrayList<Flights> flights = new ArrayList<>();

        try{

            PackageData data = new PackageData();
            data.setOperationType("LIST_FLIGHTS");
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

            flights = response.getFlights();

        }catch (Exception e){
            e.printStackTrace();
        }
        return flights;

    }

    public static ArrayList<Tickets> getTickets(){
        ArrayList<Tickets> tickets = new ArrayList<>();

        try{

            PackageData data = new PackageData();
            data.setOperationType("LIST_TICKETS");
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

            tickets = response.getTickets();

        }catch (Exception e){
            e.printStackTrace();
        }
        return tickets;

    }

    public static void addTicket(Tickets ticket){

        try{

            PackageData data = new PackageData();
            data.setOperationType("ADD_TICKET");
            data.setTicket(ticket);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeTicket(Tickets ticket){

        try{

            PackageData data = new PackageData();
            data.setOperationType("CHANGE_TICKET");
            data.setTicket(ticket);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeTicket(Tickets ticket){

        try{

            PackageData data = new PackageData();
            data.setOperationType("REMOVE_TICKET");
            data.setTicket(ticket);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
