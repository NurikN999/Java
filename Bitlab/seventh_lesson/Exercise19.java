package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(printNumbers(arr));
    }

    public static int printNumbers(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 != 0)
                sum += arr[i];
        }
        return sum;
    }
}
