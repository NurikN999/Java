package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
