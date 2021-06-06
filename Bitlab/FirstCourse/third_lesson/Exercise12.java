package Bitlab.third_lesson;

import java.util.*;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\t%d",i,i*i).println();
        }
    }
}
