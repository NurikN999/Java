package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int max = Integer.MIN_VALUE;
        int maxIndexRow = 0, maxIndexColumn = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxIndexRow = i;
                    maxIndexColumn = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxIndexRow + " " + maxIndexColumn);
    }
}
