package Bitlab.second_lesson;

import java.util.*;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a == b) {
            a = 0;
            b = 0;
        }
        else{
            a = a + b;
            b = a;
        }
        System.out.println(a + " " + b);
    }
}
