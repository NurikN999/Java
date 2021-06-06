package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(sum(arr));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] < 11)
                sum += arr[i];
        }
        return sum;
    }
}
