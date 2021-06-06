package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0, counter = 0;
        double average = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] < 0){
                counter++;
                sum += arr[i];
            }
        }

        average = (double)sum / counter;
        System.out.printf("%5.3f",average);
    }
}
