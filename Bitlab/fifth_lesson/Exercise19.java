package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        boolean check = false;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt((str.length() - 1) - i))
                check = true;
            else
                check = false;
        }

        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
