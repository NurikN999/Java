package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] % 2 == 0)
                counter++;
        }

        int[] arr2 = new int[counter];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                arr2[k] = arr[i];
                k++;
            }
        }

        for (int nums: arr2) {
            System.out.print(nums + " ");
        }
    }
}
