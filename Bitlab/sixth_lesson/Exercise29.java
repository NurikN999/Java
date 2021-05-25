package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise29 {
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

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] != 0)
                    sum += arr[i][j];
                else if(arr[i][j] == 0){
                    System.out.println("n");
                    break;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
