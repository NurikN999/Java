package Bitlab.second_lesson;

import java.util.*;
public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a % b == 0)
            System.out.println("divisible");
        else
            System.out.println("not divisible");
    }
}
