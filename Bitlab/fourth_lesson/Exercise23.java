package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, max = arr[0];

        int sum = 0, counter = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(min > arr[i])
                min = arr[i];
            if(max < arr[i])
                max = arr[i];
            counter++;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sum = sum - max - min;

        average = (double)sum /  (counter - 2);
        System.out.println(sum);
        System.out.println(average);
    }
}
