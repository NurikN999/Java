package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");
        String res = "";

        for (int i = 0; i < words.length; i++) {
            String capitalizeLetter = words[i].substring(0,1);
            String otherWords = words[i].substring(1);
            res += capitalizeLetter.toUpperCase() + "" + otherWords + " ";
        }

        System.out.println(res);
    }
}
