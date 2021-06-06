package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int multiplication = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > 0 && i % 2 == 0)
                multiplication *= arr[i];
        }

        System.out.println(multiplication);
    }
}
