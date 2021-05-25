package Bitlab.second_lesson;
import java.util.*;
public class Exercise15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a == b || a == c || b == c)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
