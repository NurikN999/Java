

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    final static String fileName = "first-task.txt";
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        boolean isStop = false;
        int id = 1;

        while(!isStop){
            System.out.println("PRESS [1] TO ADD USERS" +
                             "\nPRESS [2] TO LIST USERS" +
                             "\nPRESS [3] TO DELETE USERS" +
                             "\nPRESS [4] TO EXIT");
            String choice = in.next();

            if(choice.charAt(0) == '1'){
                System.out.print("\tENTER LOGIN: ");
                String login = in.next();
                System.out.print("\tENTER PASSWORD: ");
                String password = in.next();

                User user = new User(id, login, password);

                users = getUsersList();
                users.add(user);
                saveUsersList(users);
                id++;
            }else if(choice.charAt(0) == '2'){

                ArrayList usersList = getUsersList();
                for (int i = 0; i < usersList.size(); i++) {
                    System.out.println((i+1) + ") " + usersList.get(i));
                }

            }else if(choice.charAt(0) == '3'){

                ArrayList usersList = getUsersList();
                for (int i = 0; i < usersList.size(); i++) {
                    System.out.println((i+1) + ") " + usersList.get(i));
                }

                System.out.print("Which one user you want to remove?: ");
                int index = in.nextInt();
                usersList.remove(index - 1);
                saveUsersList(usersList);
            }else if(choice.charAt(0) == '4'){
                isStop = true;
            }
        }
    }

    static void saveUsersList(ArrayList<User> users){

        try{
            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < users.size(); i++) {
                fw.write(users.get(i).getId() + "\n");
                fw.write(users.get(i).getLogin() + "\n");
                fw.write(users.get(i).getPassword() + "\n");
            }

            fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static ArrayList<User> getUsersList(){

        ArrayList<User> list = new ArrayList<>();
        try{
            BufferedReader fr = new BufferedReader(new FileReader(fileName));

            String info = "";
            while((info = fr.readLine()) != null){

                String login = fr.readLine();
                String password = fr.readLine();

                list.add(new User(Integer.parseInt(info), login, password));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
