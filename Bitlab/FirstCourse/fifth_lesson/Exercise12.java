package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'a')
                str = str.replace('a','o');
        }

        System.out.println(str);
    }
}
