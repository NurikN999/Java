package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(isPalindrome(str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPalindrome(String str){
        boolean isPalindrome = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length() - 1 - i))
                isPalindrome = true;
            else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
