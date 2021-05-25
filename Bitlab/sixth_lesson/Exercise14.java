package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minRowIndex = 0, minColumnIndex = 0;
        int maxRowIndex = 0, maxColumnIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] < min){
                    min = arr[i][j];
                    minRowIndex = i;
                    minColumnIndex = j;
                }
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxRowIndex = i;
                    maxColumnIndex = j;
                }

            }
        }
        int temp = arr[maxRowIndex][maxColumnIndex];
        arr[maxRowIndex][maxColumnIndex] = arr[minRowIndex][minColumnIndex];
        arr[minRowIndex][minColumnIndex] = temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
