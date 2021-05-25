package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                res += Character.toLowerCase(s.charAt(i));
            else
                res += Character.toUpperCase(s.charAt(i));
        }

        System.out.println(res);
    }
}
