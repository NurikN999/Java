package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        uniqueNumbers(arr);
    }

    public static void uniqueNumbers(int[] arr){
        boolean isUnique = false;
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
                System.out.print(arr[i] + " ");
        }
    }
}
