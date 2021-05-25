package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int k = in.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print(arr[k][i] + " ");
        }
    }
}
