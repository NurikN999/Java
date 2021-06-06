package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String res = "";
        int n = Character.getNumericValue(str.charAt(0)) * 2;

        res += str.charAt(1) + "" + n;

        System.out.println(res);
    }
}
