package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char operand = in.next().charAt(0);
        System.out.println(calculator(a,b,operand));
    }

    public static int calculator(int a, int b, char c){
        int calc = 0;
        switch (c){
            case '+':
                calc =  a + b;
                break;
            case '-':
                calc =  a - b;
                break;
            case '/':
                calc =  a / b;
                break;
            case '*':
                calc =  a * b;
        }
        return calc;
    }
}
