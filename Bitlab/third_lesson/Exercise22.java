package Bitlab.third_lesson;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, counter = 0;

        while(n != 0){
            sum += n;
            counter++;
            n = in.nextInt();
        }

        double average = (double)sum / counter;
        System.out.println(average);
    }
}
