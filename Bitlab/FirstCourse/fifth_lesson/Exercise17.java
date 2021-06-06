package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        boolean check = false;
        if(str1.length() == str2.length()){


            for (int i = 0; i < str1.length() - 1; i++) {
                if(str1.charAt(i) == str2.charAt((str1.length()-1) - i))
                    check = true;

                else {
                    check = false;
                    break;
                }
            }
        }

        if(check == true)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
