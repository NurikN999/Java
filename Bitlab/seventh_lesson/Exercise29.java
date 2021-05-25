package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(someMethod(a, b));
    }

    public static int someMethod(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0)
            return a * b;
        else if (a % 2 != 0 && b % 2 != 0)
            return a + b;
        else if (a % 2 != 0 && b % 2 == 0)
            return a;
        else
            return b;
    }
}
