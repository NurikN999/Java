package Bitlab.third_lesson;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n != 0){
            sum += n;
            n = in.nextInt();
        }
        System.out.println(sum);
    }
}
