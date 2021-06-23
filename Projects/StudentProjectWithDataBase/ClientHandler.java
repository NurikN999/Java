package StudentProjectWithDataBase;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{

    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run(){

        try{

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData pd;

            while((pd = (PackageData) inputStream.readObject()) != null){

                if(pd.getOperationType().equals("ADD_STUDENT")){

                    System.out.println("FROM CLIENT " + pd.getOperationType());
                    MainServer.addStudent(pd.getStudent());

                    PackageData response = new PackageData();
                    response.setOperationType("STUDENT_ADDED");

                    outputStream.writeObject(response);
                }else if(pd.getOperationType().equals("LIST_STUDENTS")){

                    System.out.println("FROM CLIENT " + pd.getOperationType());
                    ArrayList<Students> students = MainServer.getStudents();
                    PackageData response = new PackageData();

                    response.setOperationType("STUDENTS_LIST");
                    response.setStudents(students);

                    outputStream.writeObject(response);

                }else {

                    PackageData response = new PackageData();
                    response.setOperationType("INCORRECT_COMMAND");

                    outputStream.writeObject(response);

                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
