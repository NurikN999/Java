package Bitlab.second_lesson;

import java.util.*;
public class Exercise27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
