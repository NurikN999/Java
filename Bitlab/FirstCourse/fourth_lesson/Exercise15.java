package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int multiplication = 1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if(arr[i] > 0)
                multiplication *= arr[i];
        }

        System.out.println(multiplication);
    }
}
