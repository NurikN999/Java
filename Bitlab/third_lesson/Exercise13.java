package Bitlab.third_lesson;

import java.util.*;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n != 0){
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
