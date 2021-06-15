package BITLAB.ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class AnotherClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try{

            Socket socket = new Socket("127.0.0.1", 1843);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            System.out.println("What is your name: ");
            String userName = in.next();

            while (true){
                System.out.println("PRESS 1 TO SEND MESSAGE" +
                        "\nPRESS 0 TO EXIT");

                String choice = in.next();
                if(choice.equals("1")){

                    String message = in.next();
                    outputStream.writeObject(userName + ": " + message);
                }else if(choice.equals("0")){
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
