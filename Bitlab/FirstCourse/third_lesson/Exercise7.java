package Bitlab.third_lesson;

import java.util.*;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}