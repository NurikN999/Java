package Bitlab.third_lesson;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0, counter = 0;
        double average = 0;

        for (int i = n; i <= m; i++) {
            sum += i;
            counter++;
        }
        average = (double)sum / counter;
        System.out.println(average);
    }
}
