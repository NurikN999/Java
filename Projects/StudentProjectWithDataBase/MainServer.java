package StudentProjectWithDataBase;

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

        try{

            ServerSocket serverSocket = new ServerSocket(1843);

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students?serverTimezone=UTC", "root", "");

            while (true){

                System.out.println("Waiting for a client...");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");

                ClientHandler ch = new ClientHandler(socket);
                ch.start();

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void addStudent(Students student){

        try{

            PreparedStatement statement = connection.prepareStatement("INSERT INTO students_table (id, name, surname, age) values (NULL ,?,?,?)");

            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getAge());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Students> getStudents(){

        ArrayList<Students> students = new ArrayList<>();

        try {

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM students_table");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){

                students.add(
                        new Students(
                                resultSet.getLong("id"),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getInt("age")
                        )
                );

            }

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }

}
