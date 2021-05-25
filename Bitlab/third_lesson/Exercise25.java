package Bitlab.third_lesson;

import java.util.*;
public class Exercise25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double result = 1;
        while(n != 0){
            result *= n;
            n = in.nextDouble();

        }
        System.out.printf("%5.3f",result);
    }
}
