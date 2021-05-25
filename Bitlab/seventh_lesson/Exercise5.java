package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char letter = in.next().charAt(0);
        System.out.println(countOfLetter(str,letter));
    }

    public static int countOfLetter(String s, char c){
        int counter = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                counter++;
        }
        return counter;
    }
}
