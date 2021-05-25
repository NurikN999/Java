package Bitlab.second_lesson;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int max = first;
        int min = first;

        if(second > max)
            max = second;
        if(third > max)
            max = third;

        if(second < min)
            min = second;
        if(third < min)
            min = third;

        int difference =  max - min;
        System.out.println(difference);
    }
}
