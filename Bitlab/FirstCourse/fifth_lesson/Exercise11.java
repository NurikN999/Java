package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int count = 0;
        String letter = in.next();
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == letter.charAt(0))
                count++;
        }

        System.out.println(count);
    }
}
