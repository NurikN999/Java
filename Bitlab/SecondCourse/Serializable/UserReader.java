

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserReader {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        try{

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bitlab.dat"));
            users = (ArrayList<User>) inputStream.readObject();
            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        for (User user: users) {
            System.out.println(user.getName() + " " + user.getNumber());
        }
    }
}
