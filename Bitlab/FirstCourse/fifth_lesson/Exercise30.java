package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        String res = "";

        for (String word: words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                res += word.charAt(i);
            }
            res += " ";
        }

        System.out.println(res);

    }


}
