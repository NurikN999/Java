

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserWritter {
    public static void main(String[] args) {

        ArrayList<User> usersList = new ArrayList<>();

        usersList.add(new User("Nurmukhamed", 123));
        usersList.add(new User("Alikhan", 124));
        usersList.add(new User("Adilzhan", 125));

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("bitlab.dat"));
            outputStream.writeObject(usersList);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
