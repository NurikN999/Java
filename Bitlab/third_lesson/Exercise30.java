package Bitlab.third_lesson;

import java.util.*;
public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //k - стоимость 1 банана
        int k = in.nextInt();

        //n - количество долларов
        int n = in.nextInt();

        //w - сколько бананов надо купить
        int w = in.nextInt();

        int cost = 0;
        for (int i = 1; i <= w; i++) {
            cost += (i*k);
        }
        int shouldTake = cost - n;
        System.out.println(shouldTake);
    }
}
