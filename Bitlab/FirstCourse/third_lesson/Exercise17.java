package Bitlab.third_lesson;

import java.util.*;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += k;
            k += 2;
        }
        System.out.println(sum);
    }
}
