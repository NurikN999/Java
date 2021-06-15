package BITLAB.ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MainServer {

    public static void main(String[] args) {

        try{

            ServerSocket server = new ServerSocket(1843);

            while(true){

                System.out.println("Waiting for a client...");
                Socket socket = server.accept();
                System.out.println("Client is connected!");

                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                RequestData input;
                while ((input = (RequestData) inputStream.readObject()) != null){
                    System.out.println(input.getUserName() + " at " + input.getSentDate() + " : " + input.getMessageText());

                    String message = input.getMessageText().substring(input.getMessageText().indexOf(" ") + 1, input.getMessageText().length());
                    RequestData output = new RequestData();
                    output.setUserName("Server");
                    output.setSentDate(new Date());
                    if(message.equals("Hello")){
                        output.setMessageText("Hi, there!");
                    }else if(message.equals("Bye")){
                        output.setMessageText("See you soon!");
                    }else
                        output.setMessageText("Sorry, cannot understand you.");

                    outputStream.writeObject(output);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
