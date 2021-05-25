package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        printDiagonal(arr);
    }

    public static void printDiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j)
                    System.out.println(arr[i][j]);
            }
        }
    }
}
