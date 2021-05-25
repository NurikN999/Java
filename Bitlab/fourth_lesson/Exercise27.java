package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = arr[0], min = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
