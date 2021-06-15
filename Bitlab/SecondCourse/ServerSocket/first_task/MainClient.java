package BITLAB.ServerSocket.first_task;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            Socket socket = new Socket("127.0.0.1", 1843);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            System.out.print("What is your name?: ");
            String name = in.next();

            while (true){

                System.out.println("PRESS [1] TO SEND MESSAGE" + "\nPRESS [2] TO EXIT");
                String choice = in.next();

                if(choice.equals("1")){

                    System.out.print("Insert message: ");
                    String message = in.next();

                    outputStream.writeObject(new MessageData(name, message, new Date()));

                }else if(choice.equals("2")){
                    outputStream.close();
                    inputStream.close();
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
