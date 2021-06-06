package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE;
        int minRowIndex = 0, minColumnIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    minRowIndex = i;
                    minColumnIndex = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i != minRowIndex && j != minColumnIndex)
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
