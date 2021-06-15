package BITLAB.ServerSocket.first_task;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) {

        try{

            ServerSocket server = new ServerSocket(1843);

            while(true){
                System.out.println("Waiting for a client...");
                Socket socket = server.accept();
                System.out.println("Client connected");

                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                MessageData input;
                while((input = (MessageData) inputStream.readObject()) != null){

                    System.out.println("\"" + input.getMessageText() + "\" from " + input.getUserName() + " at " + input.getSentDate());

                }
            }

        }catch (Exception e){
            System.out.println("Client finished his work!");
            System.exit(0);
        }
    }
}
