package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[j][i] < min){
                    min = arr[j][i];
                    minIndex = j;
                }

                if(arr[j][i] > max){
                    max = arr[j][i];
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex][i];
            arr[maxIndex][i] = arr[minIndex][i];
            arr[minIndex][i] = temp;

            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            minIndex = 0;
            maxIndex = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
