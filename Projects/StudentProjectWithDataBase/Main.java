package StudentProjectWithDataBase;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    private static Socket socket;
    private static ObjectOutputStream outputStream;
    private static ObjectInputStream inputStream;

    public static void main(String[] args) {

        try {

            socket = new Socket("127.0.0.1",1843);
            outputStream = new ObjectOutputStream(socket.getOutputStream());
            inputStream = new ObjectInputStream(socket.getInputStream());

        }catch (Exception e){
            e.printStackTrace();
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);

    }

    public static void addStudent(Students student){

        try{

            PackageData data = new PackageData();
            data.setOperationType("ADD_STUDENT");
            data.setStudent(student);

            outputStream.writeObject(data);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<Students> getStudents(){

        ArrayList<Students> students = new ArrayList<>();

        try{

            PackageData pd = new PackageData();
            pd.setOperationType("LIST_STUDENTS");
            outputStream.writeObject(pd);

            PackageData response = (PackageData) inputStream.readObject();
            System.out.println("FROM SERVER: " + response.getOperationType());

            students = response.getStudents();

        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

}
