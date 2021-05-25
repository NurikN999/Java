package Bitlab.third_lesson;

import java.util.*;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = n; i <= m; i++) {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
