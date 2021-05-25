package Bitlab.second_lesson;

import java.util.*;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n < 20)
            n = n * 6;
        else
            n = n / 6;
        System.out.println(n);
    }
}
