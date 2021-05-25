package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(getMax(a,b,c));
    }

    public static int getMax(int a, int b, int c){
        int max = a;
        if(b > a && b > c)
            max = b;
        else if(c > a && c > b)
            max = c;

        return max;
    }
}
