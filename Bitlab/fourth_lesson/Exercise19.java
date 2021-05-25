package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min * min);
    }
}
