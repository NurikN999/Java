package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int j = 0; j < size; j++) {
            arr[j] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
