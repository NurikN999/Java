package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String example = "BITLAB";
        String str = in.next();
        if(str.equals(example))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
