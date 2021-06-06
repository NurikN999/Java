package Bitlab.third_lesson;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        while(in.nextInt() != 0){
            counter++;
        }
        System.out.println(counter);
    }
}
