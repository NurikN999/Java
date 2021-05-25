package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(isTriangle(a,b,c))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a)
            return true;
        return false;
    }
}
