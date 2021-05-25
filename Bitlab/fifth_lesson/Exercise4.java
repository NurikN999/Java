package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.equalsIgnoreCase("java"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
