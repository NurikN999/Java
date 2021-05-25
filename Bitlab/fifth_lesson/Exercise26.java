package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");

        for (String word: words) {
            if(word.contains("<")){
                int start = word.indexOf('<');
                int finish = word.indexOf('>');
                System.out.println(word.substring(start+1,finish));
            }
        }
    }
}
