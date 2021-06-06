package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String str2 = in.next();

        if(str.contains(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
