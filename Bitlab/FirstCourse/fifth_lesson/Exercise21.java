package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] nums = str.split("[+,-,*,/]");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        int res = 0;

        switch(str.charAt(1)){
            case '+':
                res = num1 + num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '/':
                res = num1 / num2;
        }

        System.out.println(res);
    }
}
