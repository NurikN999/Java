package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i] % k == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
