package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise16 {
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

        maxInRow(arr);
    }

    public static void maxInRow(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println(max);
            max = Integer.MIN_VALUE;
        }
    }
}
