package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int sum = 0, counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > m){
                sum += arr[i];
                counter++;
            }
        }

        double average = (double)sum/counter;
        System.out.println(average);
    }
}
