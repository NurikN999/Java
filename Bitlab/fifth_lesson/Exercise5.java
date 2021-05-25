package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2 = in.next();
        if(str.equalsIgnoreCase(str2))
            System.out.println("THEY ARE EQUAL");
        else
            System.out.println("THEY ARE NOT EQUAL");
    }
}
