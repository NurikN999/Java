package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                res += 0;
            }
            else
                res += s.charAt(i);
        }
        System.out.println(res);
    }
}
