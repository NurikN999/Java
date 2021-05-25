package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        if(isContain(s1,s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isContain(String s1, String s2){
        if(s1.contains(s2))
            return true;
        return false;
    }
}
