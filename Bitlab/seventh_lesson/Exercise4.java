package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(doubleAllLetters(s));
    }

    public static String doubleAllLetters(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i) + "" + s.charAt(i);
        }
        return res;
    }
}
