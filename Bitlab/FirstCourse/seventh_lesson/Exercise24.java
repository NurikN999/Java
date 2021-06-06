package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise24 {
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
        System.out.println(sumOfOddRowAndColumn(arr));
    }

    public static int sumOfOddRowAndColumn(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i % 2 != 0 && j % 2 != 0)
                    sum += arr[i][j];
            }
        }
        return sum;
    }
}
