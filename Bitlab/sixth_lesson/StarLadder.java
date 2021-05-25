package Bitlab.sixth_lesson;

import java.util.Scanner;

public class StarLadder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        char[][] stars = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stars[i][j] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
    }
}
