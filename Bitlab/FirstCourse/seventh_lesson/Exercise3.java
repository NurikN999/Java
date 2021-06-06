package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isEven(a);
    }

    public static void isEven(int a){
        if(a % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
