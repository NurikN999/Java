package Bitlab.second_lesson;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();

        if(year >= 1001 && year <= 2000){
            if(month >= 1 && month <= 12)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
