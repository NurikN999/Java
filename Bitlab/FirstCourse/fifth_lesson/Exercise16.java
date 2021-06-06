package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                sum += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}
