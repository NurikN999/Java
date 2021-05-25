package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise29{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int indexOfFirstZero = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                indexOfFirstZero = i;
                break;
            }
        }

        int i = indexOfFirstZero + 1;
        while (arr[i] != 0) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
