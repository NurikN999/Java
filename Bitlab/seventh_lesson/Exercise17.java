package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        printOdd(arr);
    }

    public static void printOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                if(arr[i] != 23)
                    System.out.println(arr[i]);
                else
                    break;
            }
        }
    }
}
