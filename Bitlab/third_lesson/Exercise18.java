package Bitlab.third_lesson;

import java.util.*;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * 3);
        }
        System.out.println(sum);
    }
}
