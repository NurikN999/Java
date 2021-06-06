package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[][] newArr = changeLines(arr);
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] changeLines(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length/2) {
                for (int j = 0; j < arr[i].length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[arr.length / 2 + 1 + i][j];
                    arr[arr.length / 2 + 1 + i][j] = temp;
                }
            }
            else
                break;
        }
        return arr;
    }
}
