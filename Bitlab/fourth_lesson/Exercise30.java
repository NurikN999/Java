package Bitlab.fourth_lesson;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean check = false;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                if((arr[j] > 0 && arr[i] < 0) || (arr[j] < 0 && arr[i] > 0))
                    check = true;
                else
                    check = false;
            }
        }

        if(check == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
