package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();
        if(checkData(login,password))
            System.out.println("Authentication completed");
        else
            System.out.println("Invalid login or password");
    }

    public static boolean checkData(String login, String password){
        if(login.equals("admin") && password.equals("qwerty"))
            return true;
        return false;
    }
}
