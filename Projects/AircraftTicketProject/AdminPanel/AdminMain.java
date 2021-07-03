package AircraftTicketProject.AdminPanel;

import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.PackageData;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class AdminMain {

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

    public static void addCity(City city){

        try{

            PackageData data = new PackageData();
            data.setOperationType("ADD_CITY");
            data.setCity(city);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType() + " " + response.getCity());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeCity(City city){

        try{

            PackageData data = new PackageData();
            data.setOperationType("CHANGE_CITY");
            data.setCity(city);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeCity(City city){

        try{

            PackageData data = new PackageData();
            data.setOperationType("REMOVE_CITY");
            data.setCity(city);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<City> getCities(){
        ArrayList<City> cities = new ArrayList<>();

        try{

            PackageData data = new PackageData();
            data.setOperationType("LIST_CITIES");
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

            cities = response.getCities();

        }catch (Exception e){
            e.printStackTrace();
        }
        return cities;

    }

    public static void addAircraft(Aircraft aircraft){

        try{

            PackageData data = new PackageData();
            data.setOperationType("ADD_AIRCRAFT");
            data.setAircraft(aircraft);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeAircraft(Aircraft aircraft){

        try{

            PackageData data = new PackageData();
            data.setOperationType("CHANGE_AIRCRAFT");
            data.setAircraft(aircraft);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeAircraft(Aircraft aircraft){

        try{

            PackageData data = new PackageData();
            data.setOperationType("REMOVE_AIRCRAFT");
            data.setAircraft(aircraft);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Aircraft> getAircraft(){
        ArrayList<Aircraft> aircrafts = new ArrayList<>();

        try{

            PackageData data = new PackageData();
            data.setOperationType("LIST_AIRCRAFT");
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

            aircrafts = response.getAircrafts();

        }catch (Exception e){
            e.printStackTrace();
        }
        return aircrafts;

    }

    public static void addFlight(Flights flight){

        try{

            PackageData data = new PackageData();
            data.setOperationType("ADD_FLIGHT");
            data.setFlight(flight);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeFlight(Flights flight){

        try{

            PackageData data = new PackageData();
            data.setOperationType("CHANGE_FLIGHT");
            data.setFlight(flight);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeFlight(Flights flight){

        try{

            PackageData data = new PackageData();
            data.setOperationType("REMOVE_FLIGHT");
            data.setFlight(flight);
            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

        }catch (Exception e){
            e.printStackTrace();
        }

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


}
