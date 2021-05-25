package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        printNumbers(arr);
    }

    public static void printNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0 && arr[i] < 50)
                System.out.println(arr[i]);
        }
    }
}
