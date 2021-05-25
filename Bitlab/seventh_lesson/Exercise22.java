package Bitlab.seventh_lesson;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = in.next();
        }
        String s = in.next();
        if(isInArray(word,s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isInArray(String[] words, String word){
        boolean isIn = false;
        for (String w: words) {
            if(w.equals(word))
                isIn = true;
        }
        return isIn;
    }
}
