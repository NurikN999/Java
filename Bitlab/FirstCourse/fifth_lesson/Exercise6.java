package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String letter = in.next();
        boolean check = false;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter.charAt(0)){
                index = i;
                check = true;
            }
        }

        if(check)
            System.out.println(index);
        else
            System.out.println("THERE IS NO SUCH LETTER");
    }
}
