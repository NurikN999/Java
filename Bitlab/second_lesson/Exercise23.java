package Bitlab.second_lesson;

import java.util.*;
public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n >= 1 && n <= 5)
            n += 10;
        else if(n >= 10 && n <= 20)
            n -= 5;
        else if(n < 0 || n > 1000)
            n *= 3;
        else
            n = 0;
        System.out.println(n);
    }
}
