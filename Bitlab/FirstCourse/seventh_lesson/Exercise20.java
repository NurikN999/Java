package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printSeason(n);
    }

    public static void printSeason(int n){
        if(n == 1 || n == 12 || n == 2)
            System.out.println("Winter");
        else if(n == 3 || n == 4 || n == 5)
            System.out.println("Spring");
        else if(n == 6 || n == 7 || n == 8)
            System.out.println("Summer");
        else
            System.out.println("Autumn");
    }
}
