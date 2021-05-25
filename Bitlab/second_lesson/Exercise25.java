package Bitlab.second_lesson;

import java.util.*;
public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a > b)
            System.out.println("YES");
        else {
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a + " " + b);
        }
    }
}
