package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(average(arr));
    }

    public static double average(int[] arr) {
        int sum = 0;
        int count = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                sum += arr[i];
                count++;
            }
        }
        average = (double) sum / count;

        return average;
    }
}
