package Bitlab.third_lesson;

import java.util.*;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i = 1;
        while(i != n + 1){
            if(n % i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
