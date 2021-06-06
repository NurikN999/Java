package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int  count = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A')
                count++;
            if(count == 2) {
                ch[i] = 'o';
                count = 0;
            }
            System.out.print(ch[i] + "");
        }
    }
}
