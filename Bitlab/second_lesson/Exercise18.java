package Bitlab.second_lesson;

import java.util.*;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n > 0)
            n += 1;
        else if(n < 0)
            n -= 2;
        else
            n = 10;
        System.out.println(n);
    }
}
