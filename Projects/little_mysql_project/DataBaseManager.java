package little_mysql_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataBaseManager {

    private Connection connection;

    public void connect(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars?useUnicode=true&serverTimezone=UTC", "root","");
            System.out.println("Connected to DB!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //We need some methods to save all cars from database

    public ArrayList<Cars> getCars(){

        ArrayList<Cars> cars = new ArrayList<>();
        try{

            PreparedStatement st = connection.prepareStatement("SELECT * FROM cars_table");

            ResultSet rs = st.executeQuery();

            while (rs.next()){

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                double engine_volume = rs.getDouble("engine_volume");

                cars.add(new Cars(id, name, price, engine_volume));

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return cars;
    }

    public void addCar(Cars car){
        try{

            PreparedStatement ps = connection.prepareStatement("INSERT INTO cars_table(id, name, price, engine_volume) values (?,?,?,?)");

            ps.setInt(1, car.getId());
            ps.setString(2, car.getName());
            ps.setInt(3, car.getPrice());
            ps.setDouble(4, car.getEngine_volume());

            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
