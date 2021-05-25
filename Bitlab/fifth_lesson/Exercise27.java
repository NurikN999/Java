package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        String s1 = in.next();
        String s2 = in.next();

        if(text.contains(s1))
            text = text.replace(s1,s2);

        System.out.println(text);
    }
}
