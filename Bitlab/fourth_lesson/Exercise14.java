package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0, counter = 0;
        double average = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
            counter++;
        }
        average = (double)sum / counter;

        for (int i = 0; i < n; i++) {
            if(arr[i] > average)
                System.out.print(arr[i] + " ");
        }
    }
}
