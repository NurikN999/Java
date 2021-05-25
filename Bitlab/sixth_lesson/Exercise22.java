package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        int maxInRow = Integer.MIN_VALUE;
        int[] maxNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            maxInRow = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] > maxInRow)
                    maxInRow = arr[i][j];
            }
            maxNumbers[i] = maxInRow;
        }

        int minInMaxNumbers = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(maxNumbers[i] < minInMaxNumbers)
                minInMaxNumbers = maxNumbers[i];
        }
        System.out.println(minInMaxNumbers);
    }
}
