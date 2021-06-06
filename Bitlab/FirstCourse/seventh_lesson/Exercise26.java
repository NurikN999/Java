package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("m=");
        int m = in.nextInt();
        arrWithSums(arr, m);
    }

    public static void arrWithSums(int[] arr, int m) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m)
                arr[i] = sum;

            System.out.print(arr[i] + " ");
        }
    }
}
