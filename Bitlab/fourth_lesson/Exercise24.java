package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        int targetIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                targetIndex = i;
            }
        }

        if (arr[targetIndex] == m){
            System.out.println("YES");
            System.out.println(targetIndex);
        }else
            System.out.println("NO");
    }
}
