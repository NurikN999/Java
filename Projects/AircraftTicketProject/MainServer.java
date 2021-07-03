package AircraftTicketProject;
import AircraftTicketProject.Classes.Aircraft;
import AircraftTicketProject.Classes.City;
import AircraftTicketProject.Classes.Flights;
import AircraftTicketProject.Classes.Tickets;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MainServer {

    private static Connection connection;

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(1843);

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?serverTimezone=UTC", "root", "");

            while (true){
                System.out.println("Waiting for a client...");
                Socket socket = server.accept();
                System.out.println("Client connected");

                ClientHandler ch = new ClientHandler(socket);
                ch.start();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void addCity(City city){

        try{

            PreparedStatement ps = connection.prepareStatement("INSERT INTO cities_table (id, city_name, country, short_name) values (NULL, ? , ? , ?)");

            ps.setString(1, city.getCityName());
            ps.setString(2, city.getCountry());
            ps.setString(3, city.getShort_name());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeCity(City city){

        try{

            PreparedStatement ps = connection.prepareStatement("DELETE FROM cities_table WHERE id = ?");
            ps.setLong(1, city.getId());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<City> getCities(){

        ArrayList<City> cities = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cities_table");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){

                cities.add(
                        new City(
                                resultSet.getLong("id"),
                                resultSet.getString("city_name"),
                                resultSet.getString("country"),
                                resultSet.getString("short_name")
                        )
                );

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return cities;

    }

    public static ArrayList<Aircraft> getAircrafts(){
        ArrayList<Aircraft> aircrafts = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM aircraft_table");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){

                aircrafts.add(
                        new Aircraft(
                                resultSet.getLong("id"),
                                resultSet.getString("name"),
                                resultSet.getString("model"),
                                resultSet.getInt("business_class_capacity"),
                                resultSet.getInt("economy_class_capacity"))
                );

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return aircrafts;
    }

    public static void addAircraft(Aircraft aircraft){

        try{

            PreparedStatement ps = connection.prepareStatement("INSERT INTO aircraft_table (id, name, model, business_class_capacity, economy_class_capacity) values (NULL, ? , ? , ?, ?)");

            ps.setString(1, aircraft.getName());
            ps.setString(2, aircraft.getModel());
            ps.setInt(3, aircraft.getBusiness_class_capacity());
            ps.setInt(4, aircraft.getEconomy_class_capacity());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeAircraft(Aircraft aircraft){

        try{

            PreparedStatement ps = connection.prepareStatement("DELETE FROM aircraft_table WHERE id = ?");
            ps.setLong(1, aircraft.getId());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void addFlight(Flights flight){

        try{

            PreparedStatement ps = connection.prepareStatement("INSERT INTO flights_table (id, aircraft_id, departure_city_id, arrival_city_id, departure_time, economy_class_price, business_class_price) values (NULL, ? , ? , ?, ?, ?, ?)");


            ps.setLong(1, flight.getAircraft().getId());
            ps.setLong(2, flight.getDeparture_city().getId());
            ps.setLong(3, flight.getArrival_city().getId());
            ps.setString(4, flight.getDepartureTime());
            ps.setInt(5, flight.getEconomy_place_price());
            ps.setInt(6, flight.getBusiness_place_price());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void removeFlight(Flights flight){

        try{

            PreparedStatement ps = connection.prepareStatement("DELETE FROM flights_table WHERE id = ?");
            ps.setLong(1, flight.getId());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static ArrayList<Flights> getFlights(){
        ArrayList<Flights> flights = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "SELECT a.id,a.name, a.model, a.economy_class_capacity, a.business_class_capacity, f.departure_city_id,d.city_name, d.country, d.short_name, f.arrival_city_id, c.city_name, c.country, c.short_name, f.departure_time, f.economy_class_price, f.business_class_price\n" +
                    "FROM flights_table  f\n" +
                    "INNER\n" +
                    "    JOIN aircraft_table a  ON a.id = f.aircraft_id\n" +
                    "    JOIN cities_table c ON c.id = f.arrival_city_id\n" +
                    "    JOIN cities_table d ON d.id = f.departure_city_id");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){

                flights.add(
                        new Flights(
                                resultSet.getLong("id"),
                                new Aircraft(
                                        resultSet.getLong("id"),
                                        resultSet.getString("name"),
                                        resultSet.getString("model"),
                                        resultSet.getInt("business_class_capacity"),
                                        resultSet.getInt("economy_class_capacity")
                                ),
                                new City(
                                        resultSet.getLong("id"),
                                        resultSet.getString("city_name"),
                                        resultSet.getString("country"),
                                        resultSet.getString("short_name")
                                ),
                                new City(
                                        resultSet.getLong("id"),
                                        resultSet.getString("city_name"),
                                        resultSet.getString("country"),
                                        resultSet.getString("short_name")
                                ),
                                resultSet.getString("departure_time"),
                                resultSet.getInt("economy_class_price"),
                                resultSet.getInt("business_class_price"))
                );

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return flights;
    }

    public static void changeAircraft(Aircraft aircraft){

        try{

            PreparedStatement statement = connection.prepareStatement("UPDATE aircraft_table " +
                    "SET " +
                    "name = ?, model = ?, business_class_capacity = ?, economy_class_capacity = ? " +
                    "WHERE id = ?");

            statement.setString(1, aircraft.getName());
            statement.setString(2, aircraft.getModel());
            statement.setInt(3, aircraft.getBusiness_class_capacity());
            statement.setInt(4, aircraft.getEconomy_class_capacity());
            statement.setLong(5, aircraft.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeCity(City city){

        try{

            PreparedStatement st = connection.prepareStatement("" +
                    "UPDATE cities_table" +
                    " SET city_name = ?, country = ?, short_name = ?" +
                    " WHERE id = ?");

            st.setString(1, city.getCityName());
            st.setString(2, city.getCountry());
            st.setString(3, city.getShort_name());
            st.setLong(4, city.getId());

            st.executeUpdate();
            st.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeFlight(Flights flight){

        try{

            PreparedStatement st = connection.prepareStatement("" +
                    "UPDATE flights_table" +
                    " SET aircraft_id = ?, departure_city_id = ?, arrival_city_id = ?, departure_time = ?, economy_class_price = ?, business_class_price = ? " +
                    "WHERE id = ?");

            st.setLong(1, flight.getAircraft().getId());
            st.setLong(2, flight.getDeparture_city().getId());
            st.setLong(3, flight.getArrival_city().getId());
            st.setString(4, flight.getDepartureTime());
            st.setInt(5, flight.getEconomy_place_price());
            st.setInt(6, flight.getBusiness_place_price());
            st.setLong(7, flight.getId());

            st.executeUpdate();
            st.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void addTicket(Tickets ticket){

        try{

            PreparedStatement statement = connection.prepareStatement("INSERT INTO tickets_table (id, flight_id, name, surname, passport_number, ticket_type) values (NULL, ?, ?, ?, ?, ?)");

            statement.setLong(1, ticket.getFlight().getId());
            statement.setString(2, ticket.getName());
            statement.setString(3, ticket.getSurname());
            statement.setString(4, ticket.getPassport_number());
            statement.setString(5, ticket.getTicket_type());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void changeTicket(Tickets tickets){

        try{

            PreparedStatement statement = connection.prepareStatement("UPDATE tickets_table " +
                    "SET " +
                    "flight_id = ?, name = ?, surname = ?, passport_number = ?, ticket_type = ? " +
                    "WHERE id = ?");

            statement.setLong(1, tickets.getFlight().getId());
            statement.setString(2, tickets.getName());
            statement.setString(3, tickets.getSurname());
            statement.setString(4, tickets.getPassport_number());
            statement.setString(5, tickets.getTicket_type());
            statement.setLong(6, tickets.getId());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Tickets> getTickets(){

        ArrayList<Tickets> tickets = new ArrayList<>();

        try{

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM tickets_table");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){

                tickets.add(
                        new Tickets(
                                resultSet.getLong("id"),
                                getFlights().get((int) resultSet.getLong("flight_id") - 1),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getString("passport_number"),
                                resultSet.getString("ticket_type")
                        )
                );

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return tickets;

    }

    public static void removeTicket(Tickets ticket){

        try{

            PreparedStatement ps = connection.prepareStatement("DELETE FROM tickets_table WHERE id = ?");
            ps.setLong(1, ticket.getId());

            ps.executeUpdate();
            ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
