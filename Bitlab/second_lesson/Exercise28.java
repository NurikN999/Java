package Bitlab.second_lesson;

import java.util.*;
public class Exercise28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();

        if(login.equals("user") && password.equals("qwerty"))
            System.out.println("Authentication completed");
        else
            System.out.println("Invalid Login or Password");
    }
}
