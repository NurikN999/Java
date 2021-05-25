package Bitlab.sixth_lesson;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr =  {{12,5,7,6},
                        {4,0,2,7},
                        {9,1,3,2},
                        {10,-2,4,6}};

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(arr[n][m]);
    }
}
