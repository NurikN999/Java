package BITLAB.ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try{

            Socket socket = new Socket("127.0.0.1",1843);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            System.out.print("Setup your name: ");
            String userName = in.next();

            while(true){
                System.out.println("PRESS 1 TO SEND MESSAGE" +
                                 "\nPRESS 0 TO EXIT");

                String choice = in.next();
                if(choice.equals("1")){

                    System.out.print("Insert message: ");
                    String message = in.next();

                    RequestData data = new RequestData();
                    data.setUserName(userName);
                    data.setMessageText(message);
                    data.setSentDate(new Date());
                    outputStream.writeObject(data);


                    RequestData response = (RequestData) inputStream.readObject();
                    System.out.println(response.getUserName() + " at " + response.getSentDate() + " : " + response.getMessageText());
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
