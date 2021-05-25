package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int sumOfRow = 0;
        double averageOfRow = 0;
        double averages[] = new double[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sumOfRow = 0;
            averageOfRow = 0;
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                sumOfRow += arr[i][j];
            }
            averageOfRow = (double)sumOfRow / m;
            averages[i] = averageOfRow;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] < averages[i])
                    arr[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}