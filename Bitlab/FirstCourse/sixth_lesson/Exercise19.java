package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println(max);
            max = Integer.MIN_VALUE;
        }
    }
}
