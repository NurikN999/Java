package Bitlab.sixth_lesson;
import java.util.*;

public class Exercise28{
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


        for (int i = 0; i < n; i++) {
            if(i != n/2){
                int temp = arr[i][i];
                arr[i][i] = arr[i][n-i-1];
                arr[i][n-i-1] = temp;
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