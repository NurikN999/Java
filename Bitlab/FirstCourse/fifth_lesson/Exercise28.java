package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toLowerCase();
        String[] words = s.split(" ");

        for (String word: words) {
            switch (word){
                case "one":
                    s = s.replace("one","1");
                    break;
                case "two":
                    s = s.replace("two","2");
                    break;
                case "three":
                    s = s.replace("three","3");
                    break;
                case "four":
                    s = s.replace("four","4");
                    break;
                case "five":
                    s = s.replace("five","5");
                    break;
                case "six":
                    s = s.replace("six","6");
                    break;
                case "seven":
                    s = s.replace("seven","7");
                    break;
                case "eight":
                    s = s.replace("eight","8");
                    break;
                case "nine":
                    s = s.replace("nine","9");
            }
        }
        System.out.println(s);
    }
}
