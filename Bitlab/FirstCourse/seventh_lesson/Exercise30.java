package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        printSomeNumbers(arr, m);
    }

    public static void printSomeNumbers(int[] arr, int m) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i && arr[i] % m != 0)
                System.out.println(arr[i] + " ");
        }
    }
}
