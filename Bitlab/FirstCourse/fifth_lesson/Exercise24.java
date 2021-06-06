package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)))
                counter++;
        }

        System.out.println(counter);
    }
}
